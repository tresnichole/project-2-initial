package com.csc205.project2;

public class Cone extends Shape implements ThreeDimensionalShape {
    public double radius;
    private double height;

    public Cone() {
        super();
        this.radius = 0.0;
        this.height = 0.0;
    }

    public Cone(double h, double r) {
        super();
        this.height = h;
        this.radius = r;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea() {
        return Math.PI * getRadius() * (radius + Math.sqrt((Math.pow(height, 2) + Math.pow(radius, 2))));
    }


    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * (height / 3);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone{");
        sb.append("radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume= ").append(volume());
        sb.append('}');
        return sb.toString();
    }


}