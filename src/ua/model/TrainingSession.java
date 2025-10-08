package ua.model;

import java.time.LocalDateTime;

public record TrainingSession(LocalDateTime sessionDateTime, int duration, Team team) {

    public static TrainingSession create(LocalDateTime dt, int duration, Team team) {
        return new TrainingSession(dt, duration, team);
    }

    @Override
    public String toString() {
        return "Тренування команди " + team.name() + 
               " (" + sessionDateTime + ", " + duration + " хв)";
    }
}
