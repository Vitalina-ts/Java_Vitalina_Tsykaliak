package ua.model;

import ua.util.ValidationHelper;

public class Player {
    private String firstName;
    private String lastName;
    private String position;
    private int number;

    public Player(String firstName, String lastName, String position, int number) {
        if (!ValidationHelper.isValidName(firstName) || !ValidationHelper.isValidName(lastName)) {
            throw new IllegalArgumentException("Неправильне ім'я або прізвище");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.number = number;
    }

  
    public static Player create(String firstName, String lastName, String position, int number) {
        return new Player(firstName, lastName, position, number);
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPosition() { return position; }
    public int getNumber() { return number; }

    public void setPosition(String position) { this.position = position; }
    public void setNumber(int number) { this.number = number; }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + position + ", №" + number + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Player)) return false;
        Player other = (Player) obj;
        return number == other.number &&
               firstName.equals(other.firstName) &&
               lastName.equals(other.lastName);
    }

    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode() + number;
    }
}
