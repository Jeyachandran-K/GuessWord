package com.jeyachandran.wordgame;

import java.util.Random;
import java.util.Scanner;

public class WordGuessingGame {
    private String wordToGuess;
    private char[] guessedLetters;
    private int attempts;
    Random rand = new Random();
    public WordGuessingGame(String[] wordList, int maxAttempts)  {
            this.wordToGuess = wordList[rand.nextInt(wordList.length)];
            this.guessedLetters = new char[wordToGuess.length()];
            for (int i=0;i<this.guessedLetters.length;i++) {
                this.guessedLetters[i] = '_';
            }
            this.attempts = maxAttempts;
    }

    public void play(){

        System.out.println("Your word is " + wordToGuess + "\n");
        Scanner scanner = new Scanner(System.in);
        boolean hasplayerwon = false;
        while(attempts > 0 && !hasplayerwon){
            displayState();
            System.out.println("You have " + attempts + " attempts left");
            System.out.println("Guess a letter: ");

            char guess = scanner.nextLine().toLowerCase().charAt(0);
            if(!processGuess(guess)){
                System.out.println("Sorry, that is not a valid guess");
                attempts--;
            }else{
                System.out.println("You got it!");
                if(new String(guessedLetters).equals(wordToGuess)){
                    System.out.println("You won!");
                    hasplayerwon = true;
                }
            }

        }
        if(!hasplayerwon){
            System.out.println("You lost!");
        }
    }

    private boolean processGuess(char guess){
            boolean letterFound = false;
        for (int i=0;i<wordToGuess.length();i++){
            if (guess == wordToGuess.charAt(i)){
                guessedLetters[i] = guess;
                letterFound = true;
            }
        }
        return letterFound;
    }
    private void displayState(){
        System.out.println("Guessed letter " + new String(guessedLetters));
    }

}
