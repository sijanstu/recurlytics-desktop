package com.sijanstu.recurlytics.components.auth;

import com.sijanstu.recurlytics.components.Gender;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterUser {
    private String firstName;
    private String lastName;
    private Gender gender;
    private String username;
    private String password;
}
