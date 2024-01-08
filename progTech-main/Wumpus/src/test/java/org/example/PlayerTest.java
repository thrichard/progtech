package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getName() {
        Player player = new Player("John Doe");
        assertEquals("John Doe", player.getName());
    }

    @Test
    void testToString() {
        Player player = new Player("John Doe");
        String expected = "Player{name='John Doe'}";
        assertEquals(expected, player.toString());
    }
    @Test
    void testPlayerHashCode() {
        Player player1 = new Player("John Doe");
        Player player2 = new Player("John Doe");
        assertEquals(player1.hashCode(), player2.hashCode());
    }

    @Test
    void testPlayerHashCodeInequality() {
        Player player1 = new Player("John Doe");
        Player player2 = new Player("Jane Doe");
        assertNotEquals(player1.hashCode(), player2.hashCode());
    }
    @Test
    void testGetNameWithEmptyString() {
        Player player = new Player("");
        assertEquals("", player.getName());
    }

    @Test
    void testEqualsWithDifferentNames() {
        Player player1 = new Player("John Doe");
        Player player2 = new Player("Jane Doe");
        assertNotEquals(player1, player2);
    }

    @Test
    void testEqualsWithNull() {
        Player player = new Player("John Doe");
        assertNotEquals(player, null);
    }

    @Test
    void testEqualsWithDifferentObjectType() {
        Player player = new Player("John Doe");
        String notAPlayer = "I'm not a Player object";
        assertNotEquals(player, notAPlayer);
    }

    @Test
    void testHashCodeWithDifferentNames() {
        Player player1 = new Player("John Doe");
        Player player2 = new Player("Jane Doe");
        assertNotEquals(player1.hashCode(), player2.hashCode());
    }
    @Test
    void testEqualsWithSameObject() {
        Player player = new Player("John Doe");
        assertEquals(player, player);
    }
}
