package game.arena;


/**
 * The Player class defines the attributes and behavior of a player in the arena.
 */
public class Player {
	private String name;
	private int health;
	private int strength;
	private int attack;
	
	 /**
     * Constructs a Player with the specified name, health, strength, and attack values.
     *
     * @param name The name of the player.
     * @param health The health of the player.
     * @param strength The strength of the player.
     * @param attack The attack value of the player.
     */
	public Player(String name,int health, int strength, int attack) {
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.attack = attack;
	}

	public int getHealth() {
		return health;
	}

	public void reduceHealth(int damage) {
		this.health = Math.max(0, this.health - damage);
	}

	public int getStrength() {
		return strength;
	}

	public int getAttack() {
		return attack;
	}

	public boolean isAlive() {
		return this.health > 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
