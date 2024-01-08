package org.example;

public class Game {
    public Player getPlayer() {
        return player;
    }

    public Board getBoard() {
        return board;
    }

    private final Player player;
    private final Board board;

    public Game(Player player) {
        this.player = player;
        this.board = new Board();
    }

    public void start() {
        System.out.println("Welcome " + player.getName() + " to the game!");
        // Itt lehet implementálni a játékszabályokat és a játéklogikát
        System.out.println("Hello" + player.getName() + "the game is under development.");
    }

    public void showBoard() {
        board.printBoard();
    }
}
