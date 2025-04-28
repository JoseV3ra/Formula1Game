package cars;
// Subclass of Car (inheritance)
public class Mercedes extends Car {
    // Constructor
    public Mercedes() {
        super("Mercedes", 240, 90);
    }
    
    // Implementation of abstract method (polymorphism)
    @Override
    public double getTeamBonus() {
        return 0.95; // 5% time reduction
    }
}