package cars;
public abstract class Car {
// Private attributes (encapsulation)
private String team;
private int speed;
private int handling;

// Constructor
public Car(String team, int speed, int handling) {
    this.team = team;
    this.speed = speed;
    this.handling = handling;
}

// Getters
public String getTeam() {
    return team;
}

public int getSpeed() {
    return speed;
}

public int getHandling() {
    return handling;
}

 // Abstract method (abstraction)
 public abstract double getTeamBonus();
    
 // Calculate lap time
 public double calculateLapTime(String weather) {
     // Base time is 100 seconds
     double lapTime = 100.0;
     
     // Better speed and handling reduce time
     lapTime -= (speed * 0.1);
     lapTime -= (handling * 0.05);
     
     // Apply weather conditions
     if (weather.equals("Rainy")) {
         lapTime += 10 + (Math.random() * 2); // +10-12 seconds
     } else if (weather.equals("Cloudy")) {
         lapTime += 5; // +5 seconds
     }
     
     // Apply team bonus (this is the team strats, pit crew efficiency, engineering excellence)
     lapTime *= getTeamBonus();
     
     // Add random factor (-2 to +2 seconds)
     lapTime += (Math.random() * 4) - 2;
     
     return lapTime;
 }

}