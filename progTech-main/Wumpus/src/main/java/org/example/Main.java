package org.example;

import java.util.Scanner;

public class Main {
    @Generated
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérlek írd le a neved:");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);
        Game game = new Game(player);

        boolean running = true;
        while (running) {
            System.out.println("Válassz a lehetséges opciók közül (írd be a számot majd nyomj egy Enter-t): (1) Játék kezdése, (2) Térképszerkesztő, (3) Kilépés");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    game.start();
                    break;
                case 2:
                    mapEditor(game);
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Érvénytelen választás. Kérlek próbáld újra.");
            }
        }
        System.out.println("Köszi hogy kipróbáltad!");
    }

    private static void mapEditor(Game game) {
        System.out.println("Üdvözöllek a térképszerkesztőben!");
        // Itt lehet további térképszerkesztési logikát implementálni
        System.out.println("A térképszerkesztő még nem teljesen implementált.");
    }
}
