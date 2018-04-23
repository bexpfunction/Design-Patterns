/**
 * 
 */
package classes;

import interfaces.Displayer;
import interfaces.WeatherSubject;
import interfaces.WeatherUpdateObserver;

/**
 * @author Burak Yazar
 *
 */
public class DisplayForecast implements Displayer, WeatherUpdateObserver {
	private WeatherSubject weatherData;
	/**
	 * 
	 */
	public DisplayForecast(WeatherSubject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	/* (non-Javadoc)
	 * @see interfaces.WeatherUpdateObserver#update(float, float, float)
	 */
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see interfaces.Displayer#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
