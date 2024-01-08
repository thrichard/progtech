package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void testBoardInitialization() {
        Board board = new Board();
        assertNotNull(board);
        // További ellenőrzések a tábla helyes inicializációjára
    }
    @Test
    void testBoardWalls() {
        Board board = new Board();
        char[][] boardArray = board.getBoard();
        for (int i = 0; i < boardArray.length; i++) {
            assertEquals('w', boardArray[i][0]);
            assertEquals('w', boardArray[i][boardArray.length - 1]);
            assertEquals('w', boardArray[0][i]);
            assertEquals('w', boardArray[boardArray.length - 1][i]);
        }
    }

    @Test
    void testBoardInnerSpaces() {
        Board board = new Board();
        char[][] boardArray = board.getBoard();
        for (int i = 1; i < boardArray.length - 1; i++) {
            for (int j = 1; j < boardArray[i].length - 1; j++) {
                assertEquals(' ', boardArray[i][j]);
            }
        }
    }
    @Test
    void testBoardSize() {
        Board board = new Board();
        assertEquals(10, board.getBoard().length);
        assertEquals(10, board.getBoard()[0].length);
    }

    @Test
    void testBoardNotNull() {
        Board board = new Board();
        assertNotNull(board.getBoard());
    }
}

