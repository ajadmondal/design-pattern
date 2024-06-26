package com.example.design_pattern.creational_pattern.factory_method.factory;

import com.example.design_pattern.creational_pattern.factory_method.product.Button;
import com.example.design_pattern.creational_pattern.factory_method.product.WindowsButton;

// Concrete Product Creator
public class WindowsDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
