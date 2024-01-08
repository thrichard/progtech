package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void testGameInitialization() {
        Player player = new Player("John Doe");
        Game game = new Game(player);
        assertNotNull(game);
        // További ellenőrzések a játék helyes inicializációjára
    }
    @Test
    void testShowBoard() {
        Player player = new Player("John Doe");
        Game game = new Game(player);
        game.showBoard();
        // Ebben a tesztben nem lehet ellenőrizni a kimenetet, mert a showBoard csak a konzolra ír
    }
    @Test
    void testGameNotNull() {
        Player player = new Player("John Doe");
        Game game = new Game(player);
        assertNotNull(game);
    }

    @Test
    void testGamePlayer() {
        Player player = new Player("John Doe");
        Game game = new Game(player);
        assertEquals("John Doe", game.getPlayer().getName());
    }
    @Test
    void testGameBoardInitialization() {
        Player player = new Player("John Doe");
        Game game = new Game(player);
        assertNotNull(game.getBoard());
    }

    @Test
    void testGamePlayerInitialization() {
        Player player = new Player("John Doe");
        Game game = new Game(player);
        assertNotNull(game.getPlayer());
        assertEquals("John Doe", game.getPlayer().getName());
    }
    @Test
    void testGameBoardNotNullAfterStart() {
        Player player = new Player("John Doe");
        Game game = new Game(player);
        game.start();
        assertNotNull(game.getBoard());
    }
}
