/**
 * 
 */
package character;

import behaviour.SwordBehaviour;

/**
 * @author Burak Yazar
 *
 */
public class Knight extends Character {

	/**
	 * 
	 */
	public Knight(String name, float health, float strength) {
		super(name, health, strength);
		weaponBehaviour = new SwordBehaviour();
	}

	/* (non-Javadoc)
	 * @see character.Character#Fight()
	 */
	@Override
	public void Fight() {
		System.out.println("Knight CHARGE!!!");
		weaponBehaviour.useWeapon();

	}

}
