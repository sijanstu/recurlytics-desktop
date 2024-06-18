package com.sijanstu.recurlytics.components.auth;

import lombok.*;

/**
 * This is a response class that is used to get the token from the server
 *
 * @author sijasntu
 * @version 1.0
 */
@Data
@Builder
public class JwtResponse {
    private String token;
    private int maxAllowedUsers;
}
