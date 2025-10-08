package ua.model;

import ua.util.ValidationHelper;

public record Coach(String firstName, String lastName, String role) {

    public Coach {
        if (!ValidationHelper.isValidName(firstName) || !ValidationHelper.isValidName(lastName)) {
            throw new IllegalArgumentException("Неправильне ім'я або прізвище");
        }
    }

    public static Coach create(String firstName, String lastName, String role) {
        return new Coach(firstName, lastName, role);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return getFullName() + " (" + role + ")";
    }
}
