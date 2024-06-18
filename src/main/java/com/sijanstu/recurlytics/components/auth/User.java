package com.sijanstu.recurlytics.components.auth;

import com.sijanstu.recurlytics.components.Gender;
import lombok.Data;

import java.sql.Date;

@Data
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private String username;
    private String password;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
    private Date lastLoginAt;
    private String lastLoginDeviceId;
}
