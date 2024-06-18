package com.sijanstu.recurlytics.services;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomException {
    private int status;
    private final String message;
    private final String error;
}
