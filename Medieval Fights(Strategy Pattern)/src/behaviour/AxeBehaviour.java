/**
 * 
 */
package behaviour;

/**
 * @author Burak Yazar
 *
 */
public class AxeBehaviour implements WeaponBehaviour {

	/* (non-Javadoc)
	 * @see behaviour.WeaponBehaviour#useWeapon()
	 */
	@Override
	public void useWeapon() {
		System.out.println("Chopping with axe!");

	}

}