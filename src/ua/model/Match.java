package ua.model;

import java.time.LocalDateTime;

public record Match(Team homeTeam, Team awayTeam, LocalDateTime matchDateTime, String score) {

    public static Match create(Team home, Team away, LocalDateTime dt, String score) {
        return new Match(home, away, dt, score);
    }

    @Override
    public String toString() {
        return "Матч: " + homeTeam.name() + " vs " + awayTeam.name() + 
               " (" + matchDateTime + ") Рахунок: " + score;
    }
}
