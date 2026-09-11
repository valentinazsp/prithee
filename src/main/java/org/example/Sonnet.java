package org.example;

import java.util.Random;

public class Sonnet {

    private final String[] words;
    private final boolean[] used;
    private final Random random = new Random();

    public Sonnet(String text) {
        this.words = text.replace("\n", " ").trim().split(" ");
        this.used = new boolean[words.length];
    }

    public int wordCount() {
        return words.length;
    }

    public String wordAt(int index) {
        return words[index];
    }

    // picks a random word that hasn't been blanked yet
    public int pickUnusedIndex() {
        int index;
        do {
            index = random.nextInt(words.length);
        } while (used[index]);
        used[index] = true;
        return index;
    }

    // prints everything up to the blank, then underscores, then stops
    public String renderUpTo(int blankIndex) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= blankIndex; i++) {
            if (i == blankIndex) {
                sb.append("_".repeat(words[i].length()));
            } else {
                sb.append(words[i]).append(" ");
            }
        }
        return sb.toString();
    }
}