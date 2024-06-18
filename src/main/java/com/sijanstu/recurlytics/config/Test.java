package com.sijanstu.recurlytics.config;

import com.here.oksse.OkSse;
import com.here.oksse.ServerSentEvent;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        SSEHandler sseHandler = new SSEHandler("https://sse.dev/test");
        sseHandler.start();
    }
}

//wrap it to a class, start, pause, resume, stop, restart, destroy

class SSEHandler {
    OkHttpClient client;
    Request request;
    OkSse okSse;
    ServerSentEvent sse;
    ServerSentEvent.Listener listener;

    public SSEHandler(String url) {
        client = new OkHttpClient.Builder().readTimeout(0, TimeUnit.SECONDS).build();
        request = new Request.Builder().url(url).build();
        okSse = new OkSse(client);
        listener = new ServerSentEvent.Listener() {
            @Override
            public void onOpen(ServerSentEvent sse, Response response) {
                System.out.println("SSE connection established");
            }

            @Override
            public void onMessage(ServerSentEvent sse, String id, String event, String message) {
                System.out.println("id: " + id);
                System.out.println("event: " + event);
                System.out.println("message: " + message);
            }

            @Override
            public void onComment(ServerSentEvent sse, String comment) {
                System.out.println("comment: " + comment);
            }

            @Override
            public boolean onRetryTime(ServerSentEvent sse, long milliseconds) {
                System.out.println("Reconnecting in " + milliseconds + "ms");
                return true;
            }

            @Override
            public boolean onRetryError(ServerSentEvent sse, Throwable throwable, Response response) {
                System.out.println("Please check your internet connection");
                return true; 
            }

            @Override
            public void onClosed(ServerSentEvent sse) {
                System.out.println("SSE connection closed");
            }

            @Override
            public Request onPreRetry(ServerSentEvent serverSentEvent, Request request) {
                return request;
            }
        };
    }

    public void start() {
        sse = okSse.newServerSentEvent(request, listener);
    }

    public void stop() {
        sse.close();
    }

    public void restart() {
        sse.close();
        start();
    }

    public void destroy() {
        sse.close();
        okSse = null;
        request = null;
        sse = null;
    }

    public static final String EVENT_STREAM_MEDIA_TYPE = "text/event-stream";
}
