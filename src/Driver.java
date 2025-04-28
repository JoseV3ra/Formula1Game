import cars.*;
// Driver class
public class Driver {
    // Private attributes (encapsulation)
    private String name;
    private Car car;
    private boolean isPlayer;
    
    // Constructor
    public Driver(String name, Car car, boolean isPlayer) {
        this.name = name;
        this.car = car;
        this.isPlayer = isPlayer;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public Car getCar() {
        return car;
    }
    
    public boolean isPlayer() {
        return isPlayer;
    }
    
    // String representation
    @Override
    public String toString() {
        return name + " (" + car.getTeam() + ")" + (isPlayer ? " [YOU]" : "");
    }
}