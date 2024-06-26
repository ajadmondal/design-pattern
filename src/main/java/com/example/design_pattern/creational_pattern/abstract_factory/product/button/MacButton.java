package com.example.design_pattern.creational_pattern.abstract_factory.product.button;

// Product Variant
public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("[MacButton]");
    }
}
