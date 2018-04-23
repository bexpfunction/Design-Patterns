/**
 * 
 */
package character;

import behaviour.AxeBehaviour;

/**
 * @author Burak Yazar
 *
 */
public class Troll extends Character {

	/**
	 * 
	 */
	public Troll(String name, float health, float strength) {
		super(name, health, strength);
		weaponBehaviour = new AxeBehaviour();
	}

	/* (non-Javadoc)
	 * @see character.Character#Fight()
	 */
	@Override
	public void Fight() {
		System.out.println("Troll fights!!!");
		weaponBehaviour.useWeapon();

	}

}
