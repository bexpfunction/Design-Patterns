/**
 * 
 */
package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.Displayer;
import interfaces.WeatherSubject;
import interfaces.WeatherUpdateObserver;

/**
 * @author Burak Yazar
 *
 */
public class DisplayWeatherStats implements Displayer, WeatherUpdateObserver {
	private WeatherSubject weatherData;
	private float minTemperature=100.0f;
	private float maxTemperature=-100.0f;
	private float avgTemperature=0.0f;
	private List<Float> temperatureList;
	/**
	 * 
	 */
	public DisplayWeatherStats(WeatherSubject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
		this.temperatureList = new ArrayList<Float>();
	}

	/* (non-Javadoc)
	 * @see interfaces.WeatherUpdateObserver#update(float, float, float)
	 */
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperatureList.add(temp);
		float totalTmp=0.0f;
		for (Float tmp : temperatureList) {
			totalTmp += tmp.floatValue();
		}
		this.avgTemperature = totalTmp / (float)temperatureList.size();
		if(temp > maxTemperature)
			this.maxTemperature = temp;
		if(temp < minTemperature)
			this.minTemperature = temp;
		display();
	}

	/* (non-Javadoc)
	 * @see interfaces.Displayer#display()
	 */
	@Override
	public void display() {
		System.out.println("Avg/Min/Max temperature = " + avgTemperature + " \\ " + minTemperature + " \\ " + maxTemperature);

	}

}
