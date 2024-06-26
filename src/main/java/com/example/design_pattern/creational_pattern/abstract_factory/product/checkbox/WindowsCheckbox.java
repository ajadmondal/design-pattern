package com.example.design_pattern.creational_pattern.abstract_factory.product.checkbox;

// Product Variant
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("[WindowsCheckbox]");
    }
}
