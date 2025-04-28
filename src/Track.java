// Track class to represent racing tracks
public class Track {
    // Private attributes (encapsulation)
    private String name;
    private String weather;
    
    // Constructor
    public Track(String name, String weather) {
        this.name = name;
        this.weather = weather;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public String getWeather() {
        return weather;
    }
}