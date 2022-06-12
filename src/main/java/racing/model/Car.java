package racing.model;

import racing.RandomNumber;

import java.util.stream.Stream;

public class Car {

    private String name;
    private int location;

    public Car(String name) {
        this.name = name;
        this.location = 0;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    public void move() {
        move(RandomNumber.generateNumber());
    }

    public void move(int randomNumber) {
        if (randomNumber >= 4) {
            this.location++;
        }
    }

    public String getInfo() {
        return this.name + " : " + this.getLocationInfo();
    }

    public String getLocationInfo() {
        String distance = "";
        for (int i = 0; i < this.location; i++) {
            distance += "-";
        }
        return distance;
    }
}
