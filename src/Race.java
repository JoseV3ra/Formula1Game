// Race class to handle a race
import java.util.ArrayList;
import java.util.List;

public class Race {
    // Private attributes (encapsulation)
    private Track track;
    private List<Driver> drivers;
    private int laps;
    
    // Constructor
    public Race(Track track, List<Driver> drivers, int laps) {
        this.track = track;
        this.drivers = drivers;
        this.laps = laps;
    }
    
    // Run the race simulation
    public void simulate() {
        System.out.println("Race at " + track.getName());
        System.out.println("Weather: " + track.getWeather());
        System.out.println("Laps: " + laps);
        System.out.println("\nRace Results:");
        
        // Store the results
        List<DriverResult> results = new ArrayList<>();
        
        // Calculate race time for each driver
        for (Driver driver : drivers) {
            double totalTime = 0;
            
            // Add up lap times
            for (int i = 0; i < laps; i++) {
                totalTime += driver.getCar().calculateLapTime(track.getWeather());
            }
            
            // Add to results
            results.add(new DriverResult(driver, totalTime));
        }
        
        // Sort results by time (fastest first)
        results.sort((r1, r2) -> Double.compare(r1.time, r2.time));
        
        // Display results
        for (int i = 0; i < results.size(); i++) {
            DriverResult result = results.get(i);
            System.out.printf("%d. %s - %.2f seconds%s\n", 
                (i + 1), 
                result.driver.toString(), 
                result.time,
                result.driver.isPlayer() ? " ★" : "");
        }
    }
    
    // Helper class to store race results
    private class DriverResult {
        Driver driver;
        double time;
        
        DriverResult(Driver driver, double time) {
            this.driver = driver;
            this.time = time;
        }
    }
}