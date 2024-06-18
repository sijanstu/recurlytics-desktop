package com.sijanstu.recurlytics.config;

import lombok.Data;

import java.util.HashMap;
import java.util.prefs.Preferences;

@Data
public class Config {
    public static String BASE_URL = "http://localhost:8080/api/v1";
    public final static String PING_URL = BASE_URL + "/ping";
    public final static String LOGIN_URL = BASE_URL + "/auth/login";
    public final static String REGISTER_URL = BASE_URL + "/auth/register";
    public final static String MARKET_STATUS_URL = BASE_URL + "/service/marketStatus";
    public final static String LIVE_DATA_URL = BASE_URL + "/service/liveData";
    public final static String AI_URL = BASE_URL + "/ai/ask";
    public final static String LIVE_INDEX_URL = BASE_URL + "/service/liveIndex";
    public final static String CHANGES_URL = BASE_URL + "/service/changes";
    public final static String MERO_SHARE_URL = BASE_URL + "/meroshare";
    public final static String DP_LIST_URL = MERO_SHARE_URL + "/dp/list";
    public final static String MEROSHARE_USER_DETAIL_URL = "https://webbackend.cdsc.com.np/api/meroShare/ownDetail/";
    public final static String MEROSHARE_PORTFOLIO_URL = MERO_SHARE_URL + "/portfolio";
    public final static String MEROSHARE_TRANSACTIONS_URL = MERO_SHARE_URL + "/transactions";
    public static final String MEROSHARE_APPLICABLE_ISSUE_URL = MERO_SHARE_URL + "/applicable";
    public static final String MEROSHARE_ISSUE_REPORT_URL = MERO_SHARE_URL + "/reports";
    public static final String MAX_ALLOWED_URL = BASE_URL + "/user/maxAllowed";
    public static final String MERO_SHARE_PORTFOLIO_URL = MERO_SHARE_URL + "/portfolio";
    public static final String PUBLISHED_IPO_URL = MERO_SHARE_URL + "/published";
    public static final String MERO_SHARE_RESULT_URL = MERO_SHARE_URL + "/result/check";
    public static final String MERO_SHARE_CAPTCHA_URL = MERO_SHARE_URL + "/result/captcha";
    public void checkStoredBaseUrl() {
        Preferences prefs = Preferences.userNodeForPackage(Config.class);
        String baseUrl = prefs.get("baseUrl", null);
        if (baseUrl != null) {
            Config.BASE_URL = baseUrl;
        }
    }


    public static final HashMap<String, String> HEADERS = new HashMap<String, String>() {{
        put("Accept", "application/json, text/plain, */*");
//        put("Accept-Language", "en-GB,en;q=0.6");
//        put("Cache-Control", "no-cache");
        put("Connection", "keep-alive");
        put("Content-Type", "application/json");
//        put("Origin", "https://meroshare.cdsc.com.np");
//        put("Pragma", "no-cache");
//        put("Referer", "https://meroshare.cdsc.com.np/");
//        put("Sec-Fetch-Dest", "empty");
//        put("Sec-Fetch-Mode", "cors");
//        put("Sec-Fetch-Site", "same-site");
//        put("Sec-GPC", "1");
//        put("User-Agent", USER_AGENT);
//        put("sec-ch-ua", "\"Not_A Brand\";v=\"8\", \"Chromium\";v=\"120\", \"Brave\";v=\"120\"");
//        put("sec-ch-ua-mobile", "?0");
//        put("sec-ch-ua-platform", "\"Windows\"");
    }};

    public static final String USER_AGENT = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36";

    public static final String AUTH_HEADER = "Authorization";
}
