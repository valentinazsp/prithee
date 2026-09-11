package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class GameTest {

    private Game game;

    @BeforeEach
    void setUp() {
        Sonnet sonnet = new Sonnet("Shall I compare thee to a summer's day?");
        Scanner scanner = new Scanner("thee\nday?\ncompare\n");
        game = new Game(sonnet, scanner);
    }

    @Test
    void play() {
        game.play();
    }
}