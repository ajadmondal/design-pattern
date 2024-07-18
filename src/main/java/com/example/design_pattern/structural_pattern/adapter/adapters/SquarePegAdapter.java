package com.example.design_pattern.structural_pattern.adapter.adapters;

import com.example.design_pattern.structural_pattern.adapter.round.RoundPeg;
import com.example.design_pattern.structural_pattern.adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
    }
}
