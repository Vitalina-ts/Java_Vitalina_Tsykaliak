package ua.model;

public enum SportType {
    FOOTBALL,
    BASKETBALL,
    VOLLEYBALL,
    TENNIS;

    public String getDescription() {
        // Switch expression (Java 14+)
        return switch (this) {
            case FOOTBALL -> "Футбол — командна гра, 11 гравців.";
            case BASKETBALL -> "Баскетбол — 5 гравців у команді.";
            case VOLLEYBALL -> "Волейбол — 6 гравців у команді.";
            case TENNIS -> "Теніс — індивідуальна або парна гра.";
        };
    }
}
