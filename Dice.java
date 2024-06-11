package game.arena;

import java.util.Random;


/**
 * The Dice class simulates rolling a six-sided die.
 */
public class Dice {
	private static final Random RANDOM = new Random();
	
	/**
     * Rolls the dice and returns a value between 1 and 6.
     *
     * @return The result of the dice roll.
     */

	public static int roll() {
		return RANDOM.nextInt(6) + 1;
	}
}
