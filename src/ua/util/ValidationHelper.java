package ua.util;

class ValidationHelper {

    static boolean isValidName(String name) {
        return name != null && name.matches("[A-Za-zА-Яа-яЇїІіЄєҐґ]+");
    }
}
