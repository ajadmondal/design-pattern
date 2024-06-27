package com.example.design_pattern.creational_pattern.builder_pattern.director;

import com.example.design_pattern.creational_pattern.builder_pattern.builder.Builder;
import com.example.design_pattern.creational_pattern.builder_pattern.product.component.Engine;
import com.example.design_pattern.creational_pattern.builder_pattern.product.component.GPSNavigator;
import com.example.design_pattern.creational_pattern.builder_pattern.product.component.Transmission;
import com.example.design_pattern.creational_pattern.builder_pattern.product.component.TripComputer;
import com.example.design_pattern.creational_pattern.builder_pattern.product.CarType;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.withCarType(CarType.SPORTS_CAR)
                .withSeats(2)
                .withEngine(new Engine(3.0, 0))
                .withTransmission(Transmission.SEMI_AUTOMATIC)
                .withTripComputer(new TripComputer())
                .withGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.withCarType(CarType.CITY_CAR)
                .withSeats(2)
                .withEngine(new Engine(1.2, 0))
                .withTransmission(Transmission.AUTOMATIC)
                .withTripComputer(new TripComputer())
                .withGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.withCarType(CarType.SUV)
                .withSeats(4)
                .withEngine(new Engine(2.5, 0))
                .withTransmission(Transmission.MANUAL)
                .withGPSNavigator(new GPSNavigator());
    }
}
