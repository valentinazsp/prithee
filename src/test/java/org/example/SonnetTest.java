package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SonnetTest {

    private Sonnet sonnet;

    @BeforeEach
    void setUp() {
        sonnet = new Sonnet("Shall I compare thee to a summer's day?");
    }

    @Test
    void wordCount() {
        assertEquals(8, sonnet.wordCount());
    }

    @Test
    void wordAt() {
        assertEquals("Shall", sonnet.wordAt(0));
        assertEquals("day?", sonnet.wordAt(7));
    }

    @Test
    void renderUpTo() {
        String result = sonnet.renderUpTo(2);
        assertEquals("Shall I _______", result);
    }

    @Test
    void pickUnusedIndex() {
        int index = sonnet.pickUnusedIndex();
        assertTrue(index >= 0 && index < sonnet.wordCount());
    }
}