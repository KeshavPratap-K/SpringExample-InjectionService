package com.example.InjectionService.model;

import java.util.UUID;

public class PrototypeScope {
    UUID id;

    public PrototypeScope() {
        id = UUID.randomUUID();
    }
    public UUID GetOperationID() {
        return id;
    }

}
