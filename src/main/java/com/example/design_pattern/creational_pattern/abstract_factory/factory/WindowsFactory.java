package com.example.design_pattern.creational_pattern.abstract_factory.factory;

import com.example.design_pattern.creational_pattern.abstract_factory.product.button.Button;
import com.example.design_pattern.creational_pattern.abstract_factory.product.button.WindowsButton;
import com.example.design_pattern.creational_pattern.abstract_factory.product.checkbox.Checkbox;
import com.example.design_pattern.creational_pattern.abstract_factory.product.checkbox.WindowsCheckbox;

// Variant Factory
public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
