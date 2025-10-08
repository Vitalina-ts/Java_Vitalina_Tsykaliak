package ua.model;

import java.util.List;

public record Team(String name, SportType sport, Coach coach, List<Player> players) {

    public static Team create(String name, SportType sport, Coach coach, List<Player> players) {
        return new Team(name, sport, coach, players);
    }

    @Override
    public String toString() {
        return "Команда: " + name + " (" + sport + "), Тренер: " + coach + "\nГравці: " + players;
    }
}
