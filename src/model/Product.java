package model;

import exception.InvalidDataException;
import util.LoggerUtil;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) throws InvalidDataException {
        if (name == null || name.isEmpty()) {
            LoggerUtil.logSevere("Помилка створення Product: порожня назва");
            throw new InvalidDataException("Назва товару не може бути порожньою!");
        }
        if (price < 0) {
            LoggerUtil.logSevere("Помилка створення Product: відʼємна ціна");
            throw new InvalidDataException("Ціна не може бути відʼємною!");
        }

        this.name = name;
        this.price = price;
        LoggerUtil.logInfo("Створено об’єкт Product: " + name);
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}
