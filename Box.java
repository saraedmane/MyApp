package Localisation;
import restaurants.Restaurant;
import java.util.ArrayList;

public class Box {
	public Coordinates upleftcoord;
	public Coordinates uprightcoord;
	public Coordinates leftcoord;
	public Coordinates rightcoord;
	public ArrayList<Restaurant> liste;
	public Box(Coordinates leftbox, Coordinates rightbox, Coordinates upleftbox, Coordinates uprightbox) {
		leftcoord=leftbox;
		rightcoord=rightbox;
		upleftcoord=upleftbox;
		uprightcoord=uprightbox;
		liste=new ArrayList<Restaurant>();
	}
}
