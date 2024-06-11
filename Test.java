package game.arena.test;

import game.arena.Arena;
import game.arena.Player;

/**
 * The Test class is the entry point for the application. It simulates a fight between two players.
 */

public class Test {

	public static void main(String[] args) {

		Player playerA = new Player("PlayerA", 50, 5, 10);
		Player playerB = new Player("PlayerB", 100, 10, 5);

		Arena.fight(playerA, playerB);

		if (playerA.isAlive()) {
			System.out.println(playerA.getName() + " wins!");
		} else {
			System.out.println(playerB.getName() + " wins!");
		}

	}
}
