package com.example.InjectionService.model;

import java.util.UUID;

public class SingletonScope {
    UUID id;

    public SingletonScope() {
        id = UUID.randomUUID();
    }
    public UUID GetOperationID() {
        return id;
    }

}
