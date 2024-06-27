package com.example.design_pattern.creational_pattern.builder_pattern.builder;

import com.example.design_pattern.creational_pattern.builder_pattern.product.component.Engine;
import com.example.design_pattern.creational_pattern.builder_pattern.product.component.GPSNavigator;
import com.example.design_pattern.creational_pattern.builder_pattern.product.component.Transmission;
import com.example.design_pattern.creational_pattern.builder_pattern.product.component.TripComputer;
import com.example.design_pattern.creational_pattern.builder_pattern.product.CarType;
import com.example.design_pattern.creational_pattern.builder_pattern.product.Manual;

public class ManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public ManualBuilder withCarType(CarType type) {
        this.type = type;
        return this;
    }

    @Override
    public ManualBuilder withSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public ManualBuilder withEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public ManualBuilder withTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public ManualBuilder withTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }

    @Override
    public ManualBuilder withGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    public Manual build(){
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
