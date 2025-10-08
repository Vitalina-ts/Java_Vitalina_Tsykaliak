package ua.model;

import ua.util.ValidationHelper;

public record Player(String firstName, String lastName, String position, int number) {

    public Player {
        if (!ValidationHelper.isValidName(firstName) || !ValidationHelper.isValidName(lastName)) {
            throw new IllegalArgumentException("Неправильне ім'я або прізвище");
        }
    }

    public static Player create(String firstName, String lastName, String position, int number) {
        return new Player(firstName, lastName, position, number);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + position + ", №" + number + ")";
    }
}
