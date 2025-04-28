package cars;
// Subclass of Car (inheritance)
public class Ferrari extends Car {
    // Constructor
    public Ferrari() {
        super("Ferrari", 240,90);
    }
    
    // Implementation of abstract method (polymorphism)
    @Override
    public double getTeamBonus() {
        return 0.93; // 7% time reduction
    }
}