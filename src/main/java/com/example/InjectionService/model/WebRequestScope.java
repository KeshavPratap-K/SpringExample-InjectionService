package com.example.InjectionService.model;

import java.util.UUID;

public class WebRequestScope {

    UUID id;

    public WebRequestScope() {
        id = UUID.randomUUID();
    }
    public UUID GetOperationID() {
        return id;
    }
}
