package ua.model;

import ua.util.ValidationHelper;

public class Coach {
    private String firstName;
    private String lastName;
    private String role;

    public Coach(String firstName, String lastName, String role) {
        if (!ValidationHelper.isValidName(firstName) || !ValidationHelper.isValidName(lastName)) {
            throw new IllegalArgumentException("Неправильне ім'я або прізвище");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public static Coach create(String firstName, String lastName, String role) {
        return new Coach(firstName, lastName, role);
    }

    public String getFullName() { return firstName + " " + lastName; }

    @Override
    public String toString() {
        return getFullName() + " (" + role + ")";
    }
}
