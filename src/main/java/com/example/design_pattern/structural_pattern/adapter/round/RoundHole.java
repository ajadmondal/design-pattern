package com.example.design_pattern.structural_pattern.adapter.round;

public class RoundHole {
    private final Integer radius;

    public RoundHole(Integer radius) {
        this.radius = radius;
    }

    public Integer getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg roundPeg){
        return this.radius >= roundPeg.getRadius();
    }
}
