package lesson11.jUnitExercise1;

public class Car {
    public String name;
    public String color;
    public Boolean isBroken;

    public Car(String name, String color, Boolean isBroken) {
        this.name = name;
        this.color = color;
        this.isBroken = isBroken;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", isBroken=" + isBroken +
                '}';
    }
}
