package ua;

import ua.model.*;
import ua.util.Utils;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        try {
            Coach coach = Coach.create("Олег", "Петренко", "Головний тренер");
            Team team = Team.create("Чемпіон", "Футбол", coach);

            Player p1 = Player.create("Іван", "Коваль", "Нападник", 10);
            Player p2 = Player.create("Андрій", "Сидоренко", "Захисник", 5);

            team.addPlayer(p1);
            team.addPlayer(p2);

            Utils.printPlayerInfo(p1);

            Match match = Match.create(team, Team.create("Суперники", "Футбол", coach),
                    LocalDateTime.now(), "2:1");

            TrainingSession training = TrainingSession.create(LocalDateTime.now().plusDays(1), 90, team);

            System.out.println("\n" + team);
            System.out.println("\n" + match);
            System.out.println("\n" + training);

        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
