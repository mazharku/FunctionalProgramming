package com.functional.java.railway;

public class Error implements Result<Throwable> {
    private final Throwable throwable;

    Error(Throwable throwable) {
        this.throwable = throwable;
    }

    @Override
    public String apply() {
        return throwable.getMessage();
    }
}
