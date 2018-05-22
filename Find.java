package restaurants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import Localisation.Grid;


public class Find {
	public static void FindServices(String databasefile,Client client,double distance, String keyword) throws JsonParseException, JsonMappingException, IOException {
		Database data=new Database();
		ArrayList<Restaurant> Services=data.createDB(new File(databasefile));
		Grid earth= new Grid();
		earth.makeBoxes();
		for (Restaurant r: Services) {
			earth.addRestaurant(r);
		}
		/*if (earth.listof(client, distance).size()==1) 
			System.out.println(earth.listof(client, distance).size()+" element found");
		else
			System.out.println(i+" elements found");*/
		
		for (Restaurant r: earth.listof(client, distance)) {
			if (keyword==null) {
				System.out.println(r); }
			else {
				for (String key: Lowercase(r.categories)) {
					if (key.contains(keyword)) {
						System.out.println(r);
						break;
					}
				}
		}
			}
		
	}
	public static ArrayList<String> Lowercase(ArrayList<String> categories) {
		ArrayList<String> newcat=new ArrayList<String>();
		for (String key: categories) {
			newcat.add(key.toLowerCase());
		}
		return newcat;
	}
	

}
