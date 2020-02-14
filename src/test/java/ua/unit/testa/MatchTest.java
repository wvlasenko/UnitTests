package ua.unit.testa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatchTest {
    private Match match = new Match();

    @Test
    void add() {
        int expected = 3;
        int actual = match.add(1, 2);
        assertEquals(expected, actual);
    }

    @Test
    void subtract() {
        int expected = 8;
        int actual = match.subtract(20, 12);
        assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        int expected = 16;
        int actual = match.subtract(2, 8);
        assertEquals(expected, actual);
    }
}