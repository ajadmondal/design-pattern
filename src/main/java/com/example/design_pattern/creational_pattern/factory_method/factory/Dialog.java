package com.example.design_pattern.creational_pattern.factory_method.factory;

import com.example.design_pattern.creational_pattern.factory_method.product.Button;

// Base Product Creator
public abstract class Dialog {
    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }

    protected abstract Button createButton();
}
