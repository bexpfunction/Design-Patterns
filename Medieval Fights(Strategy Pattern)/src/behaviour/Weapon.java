/**
 * 
 */
package behaviour;

/**
 * @author Burak Yazar
 *
 */
public abstract class Weapon implements WeaponBehaviour {
	float damage;
	/**
	 * 
	 */
	public Weapon(float damage) {
		this.damage = damage;
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see behaviour.WeaponBehaviour#useWeapon()
	 */
	@Override
	public abstract void useWeapon();

}
