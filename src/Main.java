import model.Product;
import exception.InvalidDataException;
import util.LoggerUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        String fileName = "data.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    String[] parts = line.split(",");
                    String name = parts[0].trim();
                    double price = Double.parseDouble(parts[1].trim());
                    Product product = new Product(name, price);
                    products.add(product);
                } 
                catch (InvalidDataException e) {
                    LoggerUtil.logSevere("InvalidDataException: " + e.getMessage());
                } 
                catch (NumberFormatException e) {
                    LoggerUtil.logSevere("Помилка перетворення числа: " + e.getMessage());
                } 
                catch (ArrayIndexOutOfBoundsException e) {
                    LoggerUtil.logSevere("Неповний рядок у файлі: " + line);
                }
            }
        } 
        catch (FileNotFoundException e) {
            LoggerUtil.logSevere("Файл не знайдено: " + e.getMessage());
        } 
        catch (IOException e) {
            LoggerUtil.logSevere("Помилка читання файлу: " + e.getMessage());
        } 
        finally {
            LoggerUtil.logInfo("Обробку файлу завершено.");
        }

        System.out.println("Прочитані об’єкти:");
        for (Product p : products) {
            System.out.println(p);
        }

        LoggerUtil.logInfo("Програма успішно завершила роботу.");
    }
}
