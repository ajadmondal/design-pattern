package com.example.design_pattern.creational_pattern.prototype.shape;

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    Shape(){
    }

    Shape(Shape copy){
        if(copy != null) {
            this.x = copy.x;
            this.y = copy.y;
            this.color = copy.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape shape2)) return false;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }

}
