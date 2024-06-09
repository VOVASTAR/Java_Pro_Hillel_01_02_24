package edu.hillel.homework.hw23_patterns.builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Car {

    private String engine;
    private String wheels;
    private String light;
    private String door;

    protected Car(CarBuilder carBuilder) {
        this.engine = carBuilder.getEngine();
        this.wheels = carBuilder.getWheels();
        this.light = carBuilder.getLight();
        this.door = carBuilder.getDoor();
    }

}
