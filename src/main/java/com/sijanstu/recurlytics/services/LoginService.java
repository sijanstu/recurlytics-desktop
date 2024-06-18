package com.sijanstu.recurlytics.services;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.sijanstu.recurlytics.Application;
import com.sijanstu.recurlytics.components.*;
import com.sijanstu.recurlytics.components.auth.JwtResponse;
import com.sijanstu.recurlytics.components.auth.Login;
import com.sijanstu.recurlytics.components.auth.LoginUser;
import com.sijanstu.recurlytics.components.auth.RegisterUser;
import com.sijanstu.recurlytics.config.Config;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.prefs.Preferences;

public final class LoginService {

    private static final String LOGIN_SUCCESS = "Logged in successfully";
    private static final String NETWORK_ERROR = "Network error, please try again later";
    private static final String REGISTER_SUCCESS = "Registered successfully.";
    private LoginUser loginUser;

    public void login(LoginUser loginUser) {
        this.loginUser = loginUser;
        try {
            Connection.Response response = Jsoup.connect(Config.LOGIN_URL).method(Connection.Method.POST).ignoreContentType(true).ignoreHttpErrors(true).header("Content-Type", "application/json").requestBody("{\"username\":\"" + loginUser.getUsername() + "\",\"password\":\"" + loginUser.getPassword() + "\"}").execute();
            switch (response.statusCode()) {
                case 200 -> {
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT, 2000, LOGIN_SUCCESS);
                    Application.setJwtResponse(new Gson().fromJson(response.body(), JwtResponse.class));
                }
                case 401 -> {
                    CustomException customException = new Gson().fromJson(response.body(), CustomException.class);
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT, 2000, customException.getMessage());
                }
                default -> networkError(response);
            }
        } catch (JsonSyntaxException | IOException e) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT, 2000, NETWORK_ERROR);
        }
    }

    public void register(RegisterUser registerUser) {
        try {
            Connection.Response response = Jsoup.connect(Config.REGISTER_URL).method(Connection.Method.POST).ignoreContentType(true).ignoreHttpErrors(true).header("Content-Type", "application/json").requestBody("{\"firstName\":\"" + registerUser.getFirstName() + "\",\"lastName\":\"" + registerUser.getLastName() + "\",\"gender\":\"" + registerUser.getGender() + "\",\"username\":\"" + registerUser.getUsername() + "\",\"password\":\"" + registerUser.getPassword() + "\"}").execute();
            switch (response.statusCode()) {
                case 200 -> {
                    login(loginUser);
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_RIGHT, 2000, REGISTER_SUCCESS);
                    FormsManager.getInstance().showForm(new Login());
                }
                case 401 -> {
                    CustomException customException = new Gson().fromJson(response.body(), CustomException.class);
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT, 2000, customException.getMessage());
                }
                default -> networkError(response);
            }
        } catch (JsonSyntaxException | IOException e) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT, 2000, NETWORK_ERROR);
        }
    }

    private void networkError(Connection.Response response) {
        CustomException customException = new Gson().fromJson(response.body(), CustomException.class);
        if (customException != null && customException.getMessage() != null)
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT, 2000, customException.getMessage());
        else
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT, 2000, NETWORK_ERROR);
    }

    public void setUsername(String username) {
        Preferences preferences = Preferences.userNodeForPackage(LoginService.class);
        preferences.put("recurlytics_username", username);
    }

    public String getUsername() {
        Preferences prefs = Preferences.userNodeForPackage(LoginService.class);
        return prefs.get("recurlytics_username", "");
    }

    public boolean isRemembered() {
        Preferences prefs = Preferences.userNodeForPackage(LoginService.class);
        return prefs.getBoolean("recurlytics_remember", false);
    }
}
