package com.example.design_pattern.creational_pattern.abstract_factory.factory;

import com.example.design_pattern.creational_pattern.abstract_factory.product.button.Button;
import com.example.design_pattern.creational_pattern.abstract_factory.product.button.MacButton;
import com.example.design_pattern.creational_pattern.abstract_factory.product.checkbox.Checkbox;
import com.example.design_pattern.creational_pattern.abstract_factory.product.checkbox.MacCheckbox;

// Variant Factory
public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
