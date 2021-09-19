package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape implements ThreeDimensionalShape {

    List<ThreeDimensionalShape> shapes = new ArrayList<>();

    public List<ThreeDimensionalShape> getShapes() {
        return this.shapes;
    }


    @Override
    public double volume() {
        return 0;
    }

    public double surfaceArea() {
        return 0;
    }

}
