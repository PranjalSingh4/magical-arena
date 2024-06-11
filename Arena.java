package game.arena;

/**
 * The Arena class contains the logic for the fight between two players.
 */
public class Arena {
	
	/**
     * Simulates a fight between two players until one of them dies.
     *
     * @param playerA The first player.
     * @param playerB The second player.
     */
	public static void fight(Player playerA, Player playerB) {
		Player firstAttacker = playerA.getHealth() <= playerB.getHealth() ? playerA : playerB;
		Player secondAttacker = firstAttacker == playerA ? playerB : playerA;

		while (playerA.isAlive() && playerB.isAlive()) {
			performAttack(firstAttacker, secondAttacker);
			if (secondAttacker.isAlive()) {
				performAttack(secondAttacker, firstAttacker);
			}
		}
	}
	
	
	/**
     * Performs an attack from one player to another.
     *
     * @param attacker The attacking player.
     * @param defender The defending player.
     */

	private static void performAttack(Player attacker, Player defender) {
		int attackRoll = Dice.roll();
		int defendRoll = Dice.roll();

		int attackDamage = attacker.getAttack() * attackRoll;
		int defendStrength = defender.getStrength() * defendRoll;

		int damageToDefender = Math.max(0, attackDamage - defendStrength);
		defender.reduceHealth(damageToDefender);

		System.out.println(attacker.getName() + " attacks with roll " + attackRoll + " dealing " + damageToDefender + " damage. "
				+ defender.getName() + " has " + defender.getHealth() + " health remaining.");
	}
}
