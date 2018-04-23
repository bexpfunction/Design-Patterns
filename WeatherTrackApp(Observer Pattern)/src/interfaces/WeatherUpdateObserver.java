/**
 * 
 */
package interfaces;

/**
 * @author Burak Yazar
 *
 */
public interface WeatherUpdateObserver {
	public void update(float temp, float humidity, float pressure);
}
