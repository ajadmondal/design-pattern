package com.example.design_pattern.structural_pattern.adapter;

import com.example.design_pattern.structural_pattern.adapter.adapters.SquarePegAdapter;
import com.example.design_pattern.structural_pattern.adapter.round.RoundHole;
import com.example.design_pattern.structural_pattern.adapter.round.RoundPeg;
import com.example.design_pattern.structural_pattern.adapter.square.SquarePeg;

public class AdapterDemo {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(10);
        RoundPeg smlRoundPeg = new RoundPeg(10);
        RoundPeg lrgRoundPeg = new RoundPeg(15);

        // Fitting Round Peg in Round Hole
        System.out.println("Fitting Round Peg of radius: " + smlRoundPeg.getRadius()
                + " in Round Hole of radius: " + roundHole.getRadius());
        System.out.println(roundHole.fits(smlRoundPeg)
                ? "Round Peg fits inside Round Hole"
                : "Round Peg does not fit inside Round Hole");
        System.out.println("-----------------------------------------------");

        System.out.println("Fitting Round Peg of radius: " + lrgRoundPeg.getRadius()
                + " in Round Hole of radius: " + roundHole.getRadius());
        System.out.println(roundHole.fits(lrgRoundPeg)
                ? "Round Peg fits inside Round Hole"
                : "Round Peg does not fit inside Round Hole");
        System.out.println("-----------------------------------------------");

        // Fitting Square Peg in Round Hole
        SquarePeg smlSqrPeg = new SquarePeg(15);
        SquarePeg lrgSqrPeg = new SquarePeg(20);

        SquarePegAdapter smlSqrPegAdapter = new SquarePegAdapter(smlSqrPeg);
        SquarePegAdapter lrgSqrPegAdapter = new SquarePegAdapter(lrgSqrPeg);

        System.out.println("Fitting Square Peg of width: " + smlSqrPeg.getWidth()
                + " in Round Hole of radius: " + roundHole.getRadius());
        System.out.println(roundHole.fits(smlSqrPegAdapter)
                ? "Square Peg fits inside Round Hole"
                : "Square Peg does not fit inside Round Hole");
        System.out.println("-----------------------------------------------");

        System.out.println("Fitting Square Peg of width: " + lrgSqrPeg.getWidth()
                + " in Round Hole of radius: " + roundHole.getRadius());
        System.out.println(roundHole.fits(lrgSqrPegAdapter)
                ? "Square Peg fits inside Round Hole"
                : "Square Peg does not fit inside Round Hole");
        System.out.println("-----------------------------------------------");
    }
}
