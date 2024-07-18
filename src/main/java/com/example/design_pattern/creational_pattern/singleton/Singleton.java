package com.example.design_pattern.creational_pattern.singleton;

public final class Singleton {
    private static Singleton instance;
    public Integer value;

    private Singleton(Integer value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(Integer value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
