package com.nuhman.postman.model;

public enum HTTPResponseStatus {
    OK(200, "OK"),
    Created(201, "Created"),
    Success(100, "Continue");

    HTTPResponseStatus(int i, String ok) {
    }
}
