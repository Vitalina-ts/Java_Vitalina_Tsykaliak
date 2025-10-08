package ua.model;

import java.time.LocalDateTime;

public class Match {
    private Team homeTeam;
    private Team awayTeam;
    private LocalDateTime matchDateTime;
    private String score;

    public Match(Team homeTeam, Team awayTeam, LocalDateTime matchDateTime, String score) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.matchDateTime = matchDateTime;
        this.score = score;
    }

    public static Match create(Team home, Team away, LocalDateTime dt, String score) {
        return new Match(home, away, dt, score);
    }

    @Override
    public String toString() {
        return "Матч: " + homeTeam + " vs " + awayTeam + " (" + matchDateTime + ") Рахунок: " + score;
    }
}
