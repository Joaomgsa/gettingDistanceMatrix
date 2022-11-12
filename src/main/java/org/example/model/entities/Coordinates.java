package org.example.model.entities;

public class Coordinates {

    private double original_location;
    private double location;

    public Coordinates() {
    }

    public Coordinates(double original_location, double location) {
        this.original_location = original_location;
        this.location = location;
    }

    public double getOriginal_location() {
        return original_location;
    }

    public void setOriginal_location(double original_location) {
        this.original_location = original_location;
    }

    public double getLocation() {
        return location;
    }

    public void setLocation(double location) {
        this.location = location;
    }
}
