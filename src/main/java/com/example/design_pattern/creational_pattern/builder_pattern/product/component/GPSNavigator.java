package com.example.design_pattern.creational_pattern.builder_pattern.product.component;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Just another feature of a car.
 */

@AllArgsConstructor
@Getter
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }
}
