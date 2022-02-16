package lab.oodp.challenge2;

import java.util.Random;

import lab.oodp.Keyboard;

/**
 * A guessing game!
 */
public class GuessingGame {
	
	private int number;

    public void start() {
    	number = new Random().nextInt(100)+1;
        // TODO Write your code here.
    	do {
    		System.out.print("Enter your guess (1 – 100):");
    	}while (isCorrect(Integer.parseInt(Keyboard.readInput())) != true);
    	
    	System.out.println("Good bye");
    }
    
    /**
     * Check number is correct?
     * 
     * @param guessNumber
     * @return boolean when guest is correct
     */
    public boolean isCorrect(int guessNumber) {
    	if (guessNumber < this.number) {
    		System.out.println("Too low, try again");
    	}
    	else if (guessNumber > this.number) {
    		System.out.println("Too high, try again");
    	}
    	else {
    		System.out.println("Perfect!");
    		return true;
    	}
    	
    	return false;
    }
    
    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {

        GuessingGame ex = new GuessingGame();
        ex.start();

    }
}
