package org.example;

import java.util.Scanner;

public class Game {

    private Sonnet sonnet;
    private Scanner scanner;
    private int correctCount = 0;
    private int incorrectCount = 0;

    public Game(Sonnet sonnet, Scanner scanner) {
        this.sonnet = sonnet;
        this.scanner = scanner;
    }

    public void play() {
        while (correctCount < 3 && incorrectCount < 3) {
            playRound();
        }
        announceResult();
    }

    private void playRound() {
        int blankIndex = sonnet.pickUnusedIndex();
        String correctWord = sonnet.wordAt(blankIndex);

        System.out.println(sonnet.renderUpTo(blankIndex));
        System.out.print("What's the next word? > ");
        String userAnswer = scanner.nextLine();

        if (userAnswer.equalsIgnoreCase(correctWord)) {
            correctCount++;
            System.out.println("Correct!");
        } else {
            incorrectCount++;
            System.out.println("Prithee, the word was: " + correctWord);
        }

        System.out.println("Score - correct: " + correctCount + ", incorrect: " + incorrectCount);
        System.out.println();
    }

    private void announceResult() {
        if (correctCount == 3) {
            System.out.println("You win! 3 correct answers.");
        } else {
            System.out.println("org.example.Game over. 3 incorrect answers.");
        }
    }
}