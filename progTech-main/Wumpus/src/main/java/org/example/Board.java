package org.example;

public class Board {
    private static final int SIZE = 10;

    public char[][] getBoard() {
        return board;
    }

    private final char[][] board;

    public Board() {
        this.board = new char[SIZE][SIZE];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == 0 || i == SIZE - 1 || j == 0 || j == SIZE - 1) {
                    board[i][j] = 'w'; // Wall
                } else {
                    board[i][j] = ' '; // Empty space
                }
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }


}
