package assignment1Package;

// FILENAME: Question_9_8.java 

public class Question_9_8 {

    // Main method
    public static void main(String[] args) {

        Fan fan1 = new Fan(); // The fan 1
        Fan fan2 = new Fan(); // The fan 2

        // Fan 1
        fan1.setSpeed(Fan.FAST); // Set fan speed to FAST
        fan1.setRadius(12); // Set fan radius to 12
        fan1.setColor("Green"); // Set fan color to green
        fan1.setFanOn(true); // Switched ON the fan

        // Fan 2
        fan2.setSpeed(Fan.MEDIUM); // Set fan speed to MEDIUM
        fan2.setRadius(6); // Set fan radius to 6
        fan2.setColor("Red"); // Set fan color to red
        fan2.setFanOn(false); // Switched OFF the fan

        // Display output
        System.out.println("Fan 1\n" + fan1.toString()); // Status of fan 1
        System.out.println("\nFan 2\n" + fan2.toString()); // Status of fan 2
        System.out.println(); // Blank line
    }
}
