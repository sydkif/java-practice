package assignment1Package;

// FILENAME: Fan.java

public class Fan {

    public static final int SLOW = 1; // Slow speed
    public static final int MEDIUM = 2; // Medium sped
    public static final int FAST = 3; // Fast speed
    private int speed; // Speed of fan
    private boolean fanOn; // Status of fan, by default is OFF (false)
    private double radius; // Radius of fan
    private String color; // Color of fan

    // Fan constructor
    public Fan() { // Default fan setting
        speed = SLOW; // Default speed is SLOW
        radius = 5; // Default radius is 5
        color = "Blue"; // Default color is blue
    }

    // Get the current fan speed
    public int getSpeed() {
        return speed;
    }

    // Set the speed of fan
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Check the fan status, ON (true) / OFF (false)
    public boolean isFanOn() {
        return fanOn;
    }

    // Set the fan status, ON (true) / OFF (false)
    public void setFanOn(boolean fanOn) {
        this.fanOn = fanOn;
    }

    // Get the current fan radius
    public double getRadius() {
        return radius;
    }

    // Set the radius of the fan
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Get the fan color
    public String getColor() {
        return color;
    }

    // Set the fan color
    public void setColor(String color) {
        this.color = color;
    }

    // Display the fan details
    public String toString() {
        // Check the status of fan
        if (isFanOn()) { // Fan is ON
            return "Speed  : " + getSpeed() + "\nColor  : " + getColor() + "\nRadius : " + getRadius();
        } else { // Fan is OFF
            return "Color  : " + getColor() + "\nRadius : " + getRadius() + "\nThe fan is OFF";
        }
    }
}
