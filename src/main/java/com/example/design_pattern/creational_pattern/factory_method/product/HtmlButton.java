package com.example.design_pattern.creational_pattern.factory_method.product;

// Concrete Product
public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("Render Html button.");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("[HtmlButton] Click! Button says - 'Hello World!'");
    }
}
