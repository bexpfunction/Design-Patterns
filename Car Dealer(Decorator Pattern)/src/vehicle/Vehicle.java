/**
 * 
 */
package vehicle;

/**
 * @author Burak Yazar
 *
 */
public abstract class Vehicle {
	String name = "NoName";
	
	public String getName(){
		return name;
	}
	public abstract int getCost();
}
