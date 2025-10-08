package ua.model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private String sport;
    private List<Player> players;
    protected Coach coach; // protected для демонстрації доступу

    public Team(String name, String sport, Coach coach) {
        this.name = name;
        this.sport = sport;
        this.coach = coach;
        this.players = new ArrayList<>();
    }

    public static Team create(String name, String sport, Coach coach) {
        return new Team(name, sport, coach);
    }

    public void addPlayer(Player p) { players.add(p); }

    public List<Player> getPlayers() { return players; }

    @Override
    public String toString() {
        return "Команда: " + name + " (" + sport + "), Тренер: " + coach +
                "\nГравці: " + players;
    }
}
