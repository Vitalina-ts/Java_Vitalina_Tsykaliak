package ua.model;

public enum SportType {
    FOOTBALL,
    BASKETBALL,
    VOLLEYBALL,
    TENNIS;

    // Опис кожного виду спорту за допомогою switch expression
    public String description() {
        return switch (this) {
            case FOOTBALL -> "Грається 11 на 11, основна мета — забити м'яч у ворота.";
            case BASKETBALL -> "Гра з м'ячем, мета — закинути м'яч у кошик.";
            case VOLLEYBALL -> "Командна гра, мета — перекинути м'яч через сітку.";
            case TENNIS -> "Індивідуальна або парна гра ракетками.";
        };
    }
}
