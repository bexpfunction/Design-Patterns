/**
 * 
 */
package character;

import behaviour.BowAndArrowBehaviour;

/**
 * @author Burak Yazar
 *
 */
public class King extends Character {

	/**
	 * 
	 */
	public King(String name, float health, float strength) {
		super(name, health, strength);
		weaponBehaviour = new BowAndArrowBehaviour();
	}

	/* (non-Javadoc)
	 * @see character.Character#Fight()
	 */
	@Override
	public void Fight() {
		System.out.println("I'am the KING!!!");
		weaponBehaviour.useWeapon();

	}

}
