package com.example.design_pattern.creational_pattern.builder_pattern.builder;

import com.example.design_pattern.creational_pattern.builder_pattern.product.component.Engine;
import com.example.design_pattern.creational_pattern.builder_pattern.product.component.GPSNavigator;
import com.example.design_pattern.creational_pattern.builder_pattern.product.component.Transmission;
import com.example.design_pattern.creational_pattern.builder_pattern.product.component.TripComputer;
import com.example.design_pattern.creational_pattern.builder_pattern.product.CarType;

public interface Builder {
    Builder withCarType(CarType type);
    Builder withSeats(int seats);
    Builder withEngine(Engine engine);
    Builder withTransmission(Transmission transmission);
    Builder withTripComputer(TripComputer tripComputer);
    Builder withGPSNavigator(GPSNavigator gpsNavigator);
}
