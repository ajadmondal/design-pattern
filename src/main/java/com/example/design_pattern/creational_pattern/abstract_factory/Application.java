package com.example.design_pattern.creational_pattern.abstract_factory;

import com.example.design_pattern.creational_pattern.abstract_factory.factory.GUIFactory;
import com.example.design_pattern.creational_pattern.abstract_factory.product.button.Button;
import com.example.design_pattern.creational_pattern.abstract_factory.product.checkbox.Checkbox;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    void paint(){
        button.paint();
        checkbox.paint();
    }
}
