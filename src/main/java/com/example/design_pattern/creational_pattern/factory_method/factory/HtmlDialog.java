package com.example.design_pattern.creational_pattern.factory_method.factory;

import com.example.design_pattern.creational_pattern.factory_method.product.Button;
import com.example.design_pattern.creational_pattern.factory_method.product.HtmlButton;

// Concrete Product Creator
public class HtmlDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new HtmlButton();
    }
}
