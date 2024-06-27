package com.example.design_pattern.creational_pattern.builder_pattern.builder;

import com.example.design_pattern.creational_pattern.builder_pattern.product.component.Engine;
import com.example.design_pattern.creational_pattern.builder_pattern.product.component.GPSNavigator;
import com.example.design_pattern.creational_pattern.builder_pattern.product.component.Transmission;
import com.example.design_pattern.creational_pattern.builder_pattern.product.component.TripComputer;
import com.example.design_pattern.creational_pattern.builder_pattern.product.Car;
import com.example.design_pattern.creational_pattern.builder_pattern.product.CarType;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public CarBuilder withCarType(CarType type) {
        this.type = type;
        return this;
    }

    @Override
    public CarBuilder withSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public CarBuilder withEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder withTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public CarBuilder withTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }

    @Override
    public CarBuilder withGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    public Car build(){
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
