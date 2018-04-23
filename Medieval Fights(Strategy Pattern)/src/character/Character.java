/**
 * 
 */
package character;

import behaviour.WeaponBehaviour;

/**
 * @author Burak Yazar
 *
 */
public abstract class Character {

	private String name;
	private float health;
	private float strength;
	WeaponBehaviour weaponBehaviour;
	
	/**
	 * Character constructor
	 */
	public Character(String name, float health, float strength) {
		this.name = name;
		this.health = health;
		this.strength = strength;
	}
	
	/*
	 * Each character will fight with their own style
	 */
	public abstract void Fight();
	
	/*
	 * Each character will be able to change weapons during runtime
	 */
	public void SetWeaponBehaviour(WeaponBehaviour wb){
		weaponBehaviour = wb;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the health
	 */
	public float getHealth() {
		return health;
	}

	/**
	 * @return the strength
	 */
	public float getStrength() {
		return strength;
	}
}
