package com.example.application.repository;

@FunctionalInterface
public interface ResponseCallback<T> {
    void operationFinished(T results);
}
