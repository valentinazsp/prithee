package org.example;
import org.example.Game;
import org.example.Sonnet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String sonnetText =
                "Shall I compare thee to a summer's day?\n" +
                        "Thou art more lovely and more temperate:\n" +
                        "Rough winds do shake the darling buds of May,\n" +
                        "And summer's lease hath all too short a date;\n" +
                        "Sometime too hot the eye of heaven shines,\n" +
                        "And often is his gold complexion dimm'd;\n" +
                        "And every fair from fair sometime declines,\n" +
                        "By chance or nature's changing course untrimm'd;\n" +
                        "But thy eternal summer shall not fade,\n" +
                        "Nor lose possession of that fair thou ow'st;\n" +
                        "Nor shall death brag thou wander'st in his shade,\n" +
                        "When in eternal lines to time thou grow'st:\n" +
                        "   So long as men can breathe or eyes can see,\n" +
                        "   So long lives this, and this gives life to thee.";

        Sonnet sonnet = new Sonnet(sonnetText);
        Scanner scanner = new Scanner(System.in);
        Game game = new Game(sonnet, scanner);

        game.play();
    }
}