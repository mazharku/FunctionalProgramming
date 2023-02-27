package com.functional.java.railway;

public class Success<T> implements Result<T> {
    private final T t;

    Success(T t) {
        this.t = t;
    }

    @Override
    public String apply() {
        return t.toString();
    }
}
