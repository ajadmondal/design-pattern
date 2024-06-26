package com.example.design_pattern.creational_pattern.factory_method;

import com.example.design_pattern.creational_pattern.factory_method.factory.Dialog;
import com.example.design_pattern.creational_pattern.factory_method.factory.HtmlDialog;
import com.example.design_pattern.creational_pattern.factory_method.factory.WindowsDialog;

public class Demo {
    private static Dialog htmlDialog;
    private static Dialog windowsDialog;

    public static void main(String[] args) {
        System.out.println("[HtmlButton]");
        htmlDialog = new HtmlDialog();
        htmlDialog.renderWindow();

        System.out.println("-------------------------------");

        System.out.println("[WindowsButton]");
        windowsDialog = new WindowsDialog();
        windowsDialog.renderWindow();
    }
}
