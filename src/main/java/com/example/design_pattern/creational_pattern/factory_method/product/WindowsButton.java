package com.example.design_pattern.creational_pattern.factory_method.product;

// Concrete Product
public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Render Windows button.");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("[WindowsButton] Click! Button says - 'Hello World!'");
    }
}
