package com.example.design_pattern.creational_pattern.abstract_factory.product.button;

// Product Variant
public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("[WindowsButton]");
    }
}
