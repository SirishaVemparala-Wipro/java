package com.wipro.java.usecase2;

import java.util.*;
import java.util.stream.Collectors;

// Abstract class demonstrating Abstraction
abstract class Sport {
    private String name;
    private String type;

    public Sport(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    // Abstract method for Polymorphism
    public abstract void showDetails();

    // Default implementation for sports without players
    public int getPlayers() {
        return 0; // Default 0 players for non-Cricket sports
    }

    // Sorting support for List of Sports
    public static Comparator<Sport> byName() {
        return Comparator.comparing(Sport::getName);
    }
}

// Cricket class demonstrating Inheritance and Polymorphism
class Cricket extends Sport {
    private int players;

    public Cricket(String name, String type, int players) {
        super(name, type);
        this.players = players;
    }

    @Override
    public int getPlayers() {
        return players;
    }

    @Override
    public void showDetails() {
        System.out.println("Sport: " + getName() + ", Type: " + getType() + ", Players: " + players);
    }
}

// Football class demonstrating Inheritance and Polymorphism
class Football extends Sport {
    private int duration; // in minutes

    public Football(String name, String type, int duration) {
        super(name, type);
        this.duration = duration;
    }

    @Override
    public void showDetails() {
        System.out.println("Sport: " + getName() + ", Type: " + getType() + ", Duration: " + duration + " mins");
    }
}

// SportsManager demonstrating Collections
class SportsManager {
    private List<Sport> sportsList = new ArrayList<>();
    private Map<String, Sport> sportsMap = new HashMap<>();

    // Add a sport to both List and Map
    public void addSport(Sport sport) {
        sportsList.add(sport);
        sportsMap.put(sport.getName(), sport);
    }

    // Remove a sport by name
    public void removeSport(String name) {
        sportsList.removeIf(sport -> sport.getName().equalsIgnoreCase(name));
        sportsMap.remove(name);
    }

    // Display all sports
    public void displayAllSports() {
        sportsList.forEach(Sport::showDetails);
    }

    // Get a sport by name
    public Sport getSport(String name) {
        return sportsMap.get(name);
    }

    // Filter sports using Java 8 Streams
    public List<Sport> filterSportsByType(String type) {
        return sportsList.stream()
                .filter(sport -> sport.getType().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }

    // Sort sports by name (Collections.sort)
    public void sortSportsByName() {
        sportsList.sort(Sport.byName());
    }

    // Finds the sport with the most players 
    public Optional<Sport> findSportWithMostPlayers() {
        return sportsList.stream()
                .max(Comparator.comparingInt(Sport::getPlayers)); // Now works for all sports
    }

    // Count sports by type (Using Streams & groupingBy)
    public Map<String, Long> countSportsByType() {
        return sportsList.stream()
                .collect(Collectors.groupingBy(Sport::getType, Collectors.counting()));
    }
}

// Main class to test the implementation
public class Sports {
    public static void main(String[] args) {
        SportsManager manager = new SportsManager();

        // Adding sports
        manager.addSport(new Cricket("Cricket", "Outdoor", 11));
        manager.addSport(new Football("Football", "Outdoor", 90));
        manager.addSport(new Cricket("Baseball", "Outdoor", 9));
        manager.addSport(new Football("Rugby", "Outdoor", 80));
        manager.addSport(new Cricket("Table Tennis", "Indoor", 2));

        // Display all sports
        System.out.println("\nAll Sports:");
        manager.displayAllSports();

        // Fetch and display a specific sport
        System.out.println("\nFetching Cricket details:");
        Sport cricket = manager.getSport("Cricket");
        if (cricket != null) cricket.showDetails();

        // Removing a sport
        manager.removeSport("Football");
        System.out.println("\nAfter removing Football:");
        manager.displayAllSports();

        // Filtering sports by type
        System.out.println("\nFiltering Outdoor Sports:");
        List<Sport> outdoorSports = manager.filterSportsByType("Outdoor");
        outdoorSports.forEach(Sport::showDetails);

        // Sorting sports by name
        System.out.println("\nSorting Sports by Name:");
        manager.sortSportsByName();
        manager.displayAllSports();

        // Finding the sport with the most players
        Optional<Sport> mostPlayersSport = manager.findSportWithMostPlayers();
        mostPlayersSport.ifPresent(sport -> 
            System.out.println("\nSport with the Most Players: " + sport.getName() + " (Players: " + sport.getPlayers() + ")"));

        // Counting sports by type
        System.out.println("\nCounting Sports by Type:");
        Map<String, Long> sportCounts = manager.countSportsByType();
        sportCounts.forEach((type, count) -> System.out.println(type + ": " + count));
    }
}