package Localisation;
import restaurants.Client;
import restaurants.Restaurant;



public class Distance {
	public static double degtorad(double deg) {
		return Math.PI*deg/180;
	}
	public static double distance(Client client,Restaurant resto) {
		return 6378 * (Math.PI/2 - Math.asin(Math.sin(degtorad(client.latitude)) * Math.sin(degtorad(resto.latitude)) + Math.cos(degtorad(client.longitude) - degtorad(resto.longitude)) * Math.cos(degtorad(client.latitude)) * Math.cos(degtorad(resto.latitude))));
	}
	}
