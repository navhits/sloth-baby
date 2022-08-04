package sast.example2;

public class Car {
    private final int wheels = 4;
    private int seats;
    private String color;
    public String brand;
    public String parent;

    public void setColor(String color) {
        this.color = color;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getWheels() {
        return wheels;
    }

    public String getFeatures() {
        if (parent != null) {
            return parent + " " + brand + " has " + seats + " seats and " + color + " color";
        } else {
            return brand + " has " + seats + " seats and " + color + " color";
        }
    }
}
