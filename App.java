package com.jeyachandran.wordgame;

public class App {
    public static void main(String[] args) {
        String[]    words = {"apple", "banana", "carrot", "dog", "elephant", "fox", "giraffe", "horse", "jellyfish", "kiwi", "lion", "mouse", "octopus", "panda", "penguin", "quail", "rabbit", "shark", "tiger", "turtle", "whale", "zebra"};
        WordGuessingGame game = new WordGuessingGame(words, 10);
        game.play();
    }
}
