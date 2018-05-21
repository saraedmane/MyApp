package restaurants;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Database {
	Database data;
	public ArrayList<Restaurant> createDB(File file) throws JsonParseException, JsonMappingException, IOException { 
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure( DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		//nécessaire pour éviter les erreurs à chaque fois qu'on tombe sur un attribut non réferencé dans la classe Restaurant. 
		@SuppressWarnings("resource")
		Scanner input = new Scanner(file);
		ArrayList<Restaurant> restaurants=new ArrayList<Restaurant>();
		while (input.hasNextLine()) {
			//lecture ligne à ligne du fichier 
		    String jsonInString1 = input.nextLine();
		    Restaurant resto=mapper.readValue(jsonInString1, Restaurant.class);
		    restaurants.add(resto);
		}
		return restaurants;		
	}
}
