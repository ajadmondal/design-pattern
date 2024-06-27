package com.example.design_pattern.creational_pattern.abstract_factory;

import com.example.design_pattern.creational_pattern.abstract_factory.factory.GUIFactory;
import com.example.design_pattern.creational_pattern.abstract_factory.factory.MacFactory;
import com.example.design_pattern.creational_pattern.abstract_factory.factory.WindowsFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        System.out.println("**********************************");
        System.out.println("Exploring Mac Factory");
        GUIFactory macFactory = new MacFactory();
        Application application = new Application(macFactory);
        application.paint();
        System.out.println("**********************************");

        System.out.println("**********************************");
        System.out.println("Exploring Windows Factory");
        GUIFactory winFactory = new WindowsFactory();
        application = new Application(winFactory);
        application.paint();
        System.out.println("**********************************");
    }
}
