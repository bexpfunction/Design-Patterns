/**
 * 
 */
package main;

import java.util.Random;

import classes.DisplayCurrentConditions;
import classes.DisplayForecast;
import classes.DisplayHeatIndex;
import classes.DisplayWeatherStats;
import classes.WeatherData;

/**
 * @author Burak Yazar
 * Left on page 102
 */
public class Main {
	private WeatherData weatherData;
	private DisplayCurrentConditions currentConditionsDisplay;
	private DisplayForecast forecastDisplay;
	private DisplayWeatherStats statsDisplay;
	private DisplayHeatIndex heatindexDisplay;
	/**
	 * 
	 */
	public Main() {
		this.weatherData = new WeatherData();
		this.currentConditionsDisplay = new DisplayCurrentConditions(weatherData);
		this.forecastDisplay = new DisplayForecast(weatherData);
		this.statsDisplay = new DisplayWeatherStats(weatherData);
		this.heatindexDisplay = new DisplayHeatIndex(weatherData);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main app = new Main();
		int time = 0;
		Random rnd = new Random();
		try{
			while(time < 5){
				float tmp = (float)rnd.nextInt(50);
				float hum = (float)rnd.nextInt(100);
				float press = (float)rnd.nextInt(80);
				app.weatherData.SetMeasurements(tmp, hum, press);
				time++;
				Thread.sleep(1000);
			}
		} catch(InterruptedException e){
			System.out.println("Thread error!");
			System.exit(-1);
		}
	}

}
