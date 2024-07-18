package com.example.design_pattern.creational_pattern.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance(10000);
        Singleton anotherSingleton = Singleton.getInstance(20000);
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
