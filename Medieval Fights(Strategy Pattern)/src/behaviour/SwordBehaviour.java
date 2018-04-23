/**
 * 
 */
package behaviour;

/**
 * Sword behaviour
 * @author Burak Yazar
 *
 */
public class SwordBehaviour implements WeaponBehaviour {

	/* (non-Javadoc)
	 * @see behaviour.WeaponBehaviour#useWeapon()
	 */
	@Override
	public void useWeapon() {
		System.out.println("Swinging the sword!");

	}

}
