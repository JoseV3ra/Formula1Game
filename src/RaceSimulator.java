// Main class that runs the simulation
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import cars.*;

public class RaceSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Welcome message
        System.out.println("Welcome to F1 Racing Simulator!");
        
        // Get player name
        System.out.print("Enter your driver name: ");
        String playerName = scanner.nextLine();
        
        // Car selection
        System.out.println("\nSelect your car:");
        System.out.println("1. Mercedes");
        System.out.println("2. Red Bull");
        System.out.println("3. McLaren");
        System.out.println("4. Ferrari");
        
        // Get user choice
        int carChoice = 0;
        while (carChoice < 1 || carChoice > 4) {
            System.out.print("Enter choice (1-4): ");
            try {
                carChoice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
        
        // Create player car based on choice
        Car playerCar;
        switch (carChoice) {
            case 1:
                playerCar = new Mercedes();
                break;
            case 2:
                playerCar = new RedBull();
                break;
            case 3:
                playerCar = new McLaren();
                break;
            case 4:
                playerCar = new Ferrari();
                break;
            default:
                playerCar = new Mercedes(); // Default
        }
        
        // Create player driver
        Driver playerDriver = new Driver(playerName, playerCar, true);
        
        // Create drivers
        List<Driver> allDrivers = new ArrayList<>();
        allDrivers.add(playerDriver);
        allDrivers.add(new Driver("Lewis Hamilton", new Mercedes(), false));
        allDrivers.add(new Driver("Max Verstappen", new RedBull(), false));
        allDrivers.add(new Driver("Lando Norris", new McLaren(), false));
        
        // Determine track and weather
        String[] trackNames = {"Monaco", "Monza", "Miami", "Silverstone", "Spa"};
        String[] weatherTypes = {"Sunny", "Cloudy", "Rainy"};
        
        // Choose random track and weather
        String trackName = trackNames[(int)(Math.random() * trackNames.length)];
        String weather = weatherTypes[(int)(Math.random() * weatherTypes.length)];
        
        // Create track
        Track track = new Track(trackName, weather);
        
        // Create and simulate race
        Race race = new Race(track, allDrivers, 5);
        race.simulate();
        
        scanner.close();
    }
}