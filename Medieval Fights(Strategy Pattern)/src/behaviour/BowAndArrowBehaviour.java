/**
 * 
 */
package behaviour;

/**
 * @author Burak Yazar
 *
 */
public class BowAndArrowBehaviour implements WeaponBehaviour {

	/* (non-Javadoc)
	 * @see behaviour.WeaponBehaviour#useWeapon()
	 */
	@Override
	public void useWeapon() {
		System.out.println("Shootin bow using arrow!");

	}

}
