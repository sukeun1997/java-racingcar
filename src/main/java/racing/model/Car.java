package racing.model;

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

    public void move(int randomNumber) {
        if (randomNumber >= 4) {
            this.location++;
        }
    }
}
