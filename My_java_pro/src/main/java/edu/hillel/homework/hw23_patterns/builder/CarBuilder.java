package edu.hillel.homework.hw23_patterns.builder;

import lombok.Getter;

@Getter
public class CarBuilder implements Cloneable {

    private String engine;
    private String wheels;
    private String light;
    private String door;

    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setWheels(String wheels) {
        this.wheels = wheels;
        return this;
    }

    public CarBuilder setLight(String light) {
        this.light = light;
        return this;
    }

    public CarBuilder setDoor(String door) {
        this.door = door;
        return this;
    }

    public Car buildCar() {
        CarBuilder clone = this.clone();
        this.resetBuilderValue();
        return new Car(clone);
    }

    private void resetBuilderValue() {
        this.engine = null;
        this.wheels = null;
        this.light = null;
        this.door = null;
    }

    @Override
    public CarBuilder clone() {
        try {
            return (CarBuilder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
