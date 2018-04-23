/**
 * 
 */
package interfaces;

/**
 * @author Burak Yazar
 *
 */
public interface WeatherSubject {
	public void registerObserver(WeatherUpdateObserver o);
	public void unregisterObserver(WeatherUpdateObserver o);
	public void notifyObservers();
}
