package com.example.design_pattern.creational_pattern.abstract_factory.factory;

import com.example.design_pattern.creational_pattern.abstract_factory.product.button.Button;
import com.example.design_pattern.creational_pattern.abstract_factory.product.checkbox.Checkbox;

public interface GUIFactory {

    // Create Product
    Button createButton();
    Checkbox createCheckbox();
}
