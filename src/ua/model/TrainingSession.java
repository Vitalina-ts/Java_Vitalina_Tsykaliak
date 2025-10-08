package ua.model;

import java.time.LocalDateTime;

public class TrainingSession {
    private LocalDateTime sessionDateTime;
    private int duration; 
    private Team team;

    public TrainingSession(LocalDateTime sessionDateTime, int duration, Team team) {
        this.sessionDateTime = sessionDateTime;
        this.duration = duration;
        this.team = team;
    }

    public static TrainingSession create(LocalDateTime dt, int duration, Team team) {
        return new TrainingSession(dt, duration, team);
    }

    @Override
    public String toString() {
        return "Тренування команди " + team + " (" + sessionDateTime + ", " + duration + " хв)";
    }
}
