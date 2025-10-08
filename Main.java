package ua;

import ua.model.*;
import ua.util.Utils;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Coach coach = Coach.create("Олег", "Петренко", "Головний тренер");

            Player p1 = Player.create("Іван", "Коваль", "Нападник", 10);
            Player p2 = Player.create("Андрій", "Сидоренко", "Захисник", 5);

            Team team = Team.create("Чемпіон", SportType.FOOTBALL, coach, List.of(p1, p2));
            Team rivals = Team.create("Суперники", SportType.FOOTBALL, coach, List.of());

            Match match = Match.create(team, rivals, LocalDateTime.now(), "2:1");
            TrainingSession training = TrainingSession.create(LocalDateTime.now().plusDays(1), 90, team);

            String description = team.sport().getDescription();
            System.out.println("\n📘 Вид спорту: " + description);

            Utils.printPlayerInfo(p1);

            System.out.println("\n" + team);
            System.out.println("\n" + match);
            System.out.println("\n" + training);

        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
