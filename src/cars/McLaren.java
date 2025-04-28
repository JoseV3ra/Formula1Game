package cars;
// Subclass of Car (inheritance)
public class McLaren extends Car {
    // Constructor
    public McLaren() {
        super("McLaren", 240, 90);
    }
    
    // Implementation of abstract method (polymorphism)
    @Override
    public double getTeamBonus() {
        return 0.94; // 4% time reduction
    }
}