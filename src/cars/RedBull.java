package cars;
// Subclass of Car (inheritance)
public class RedBull extends Car {
    // Constructor
    public RedBull() {
        super("Red Bull", 240, 99);
    }
    
    // Implementation of abstract method (polymorphism)
    @Override
    public double getTeamBonus() {
        return 0.93; // 7% time reduction
    }
}