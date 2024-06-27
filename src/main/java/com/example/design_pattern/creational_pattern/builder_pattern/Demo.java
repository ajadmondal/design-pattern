package com.example.design_pattern.creational_pattern.builder_pattern;

import com.example.design_pattern.creational_pattern.builder_pattern.builder.CarBuilder;
import com.example.design_pattern.creational_pattern.builder_pattern.builder.ManualBuilder;
import com.example.design_pattern.creational_pattern.builder_pattern.director.Director;
import com.example.design_pattern.creational_pattern.builder_pattern.product.Car;
import com.example.design_pattern.creational_pattern.builder_pattern.product.Manual;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        ManualBuilder manualBuilder = new ManualBuilder();

        System.out.println("Constructing Sports Car");
        director.constructSportsCar(builder);
        Car car = builder.build();
        System.out.println("Car built:\n" + car.getCarType());
        System.out.println("---------------------------------");

        System.out.println("Constructing City Car");
        director.constructCityCar(builder);
        car = builder.build();
        System.out.println("Car built:\n" + car.getCarType());
        System.out.println("---------------------------------");


        System.out.println("Constructing Suv Car");
        director.constructSUV(builder);
        car = builder.build();
        System.out.println("Car built:\n" + car.getCarType());
        System.out.println("---------------------------------");


        System.out.println("Constructing Sports car Manual");
        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.build();
        System.out.println("\nCar manual built:\n" + manual.print());
        System.out.println("---------------------------------");

        System.out.println("Constructing City Car manual");
        director.constructCityCar(manualBuilder);
        manual = manualBuilder.build();
        System.out.println("\nCar manual built:\n" + manual.print());
        System.out.println("---------------------------------");


        System.out.println("Constructing Suv Car manual");
        director.constructSUV(manualBuilder);
        manual = manualBuilder.build();
        System.out.println("\nCar manual built:\n" + manual.print());
        System.out.println("---------------------------------");


    }
}
