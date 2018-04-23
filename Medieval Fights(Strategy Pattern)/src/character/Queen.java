/**
 * 
 */
package character;

import behaviour.KnifeBehaviour;

/**
 * @author Burak Yazar
 *
 */
public class Queen extends Character {

	/**
	 * 
	 */
	public Queen(String name, float health, float strength) {
		super(name, health, strength);
		weaponBehaviour = new KnifeBehaviour();
	}

	/* (non-Javadoc)
	 * @see character.Character#Fight()
	 */
	@Override
	public void Fight() {
		System.out.println("I'am the Queen!!!");
		weaponBehaviour.useWeapon();

	}

}
