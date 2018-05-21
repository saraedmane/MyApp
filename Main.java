package restaurants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import Localisation.Grid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		Client yazid= new Client(33.472831, -112.166421);
		Find.FindServices("restautest.json",yazid,0.9,""); }
		/*String[] foodkeywords = {"Hot Dogs","Beer","Indonesian","Cocktail Bars","Food Delivery Services","Food","Themed Cafes","Pan Asian","Tex-Mex","Flatbread","Russian","Beer Garden","Macarons","Shanghainese","DJs","Gay Bars","Cheesesteaks","Swiss Food","Canadian (New)","Breweries","Internet Cafes","Barbeque","Pizza","Indian","Venezuelan","Mongolian","Pubs","Ukrainian","Latin American","Egyptian","Waffles","Breakfast & Brunch","Bakeries","Wine Tasting Classes","Vegan","International Grocery","Coffee Roasteries","Coffee & Tea","Fishmonger","Sri Lankan","Vietnamese","Seafood","Cafes","Coffee & Tea Supplies","Ramen","Thai","Czech/Slovakian","Wineries","Food Stands","Beer Bar","Delis","Cafeteria","Cuban","Bulgarian","Halal","Malaysian","Soup","Gelato","Scottish","Iberian","Diners","Sugar Shacks","Arabian","Tea Rooms","Gluten-Free","Serbo Croatian","Irish","Meat Shops","Honduran","Ethnic Food","Italian","New Mexican Cuisine","Bangladeshi","Steakhouses","Middle Eastern","Greek","Bars","Specialty Food","Burgers","Modern European","Tacos","Food Tours","Sports Wear","Payroll Services","Noodles","Taiwanese","Uzbek","Filipino","Pub Food","Patisserie/Cake Shop","Fruits & Veggies","Peruvian","Food Trucks","Puerto Rican","Japanese Curry","Signature Cuisine","Asian Fusion","Lebanese","Baguettes","Ethiopian","Himalayan/Nepalese","Eastern German","Donuts","Fast Food","Dinner Theater","Senegalese","Turkish","Kebab","Pretzels","American (Traditional)","Slovakian","Cupcakes","Sandwiches","Comfort Food","Champagne Bars","Trinidadian","Cambodian", "Wok","Persian/Iranian","Sushi Bars","Buffets","Syrian","Game Meat","Cheese Tasting Classes","Tapas Bars","Nicaraguan","Bavarian","Salad","Mexican","Churros","Irish Pub","Parent Cafes","Bed & Breakfast","Gastropubs","Traditional Norwegian","Japanese","Dominican","Georgian","Juice Bars & Smoothies","Mulled Wine","Tuscan","Szechuan","Beverage Store","Mosques","Caribbean","Pasta Shops","Tapas/Small Plates","Whiskey Bars","Pakistani","Swabian","Mauritius","Home Inspectors","Belgian","Battery Stores","Diagnostic Imaging","Burmese","Wraps","Seafood Markets","Car Dealers","Acupuncture","Air Duct Cleaning","Bagels","Polish","Laotian","Ice Cream & Frozen Yogurt","Mediterranean","Friterie","Hungarian","Brazilian","Armenian","Afghan","Chicken Shop","Soul Food","Hawaiian","Pita","Beer Tours","Portuguese","Fish & Chips","South African","Sicilian","Schnitzel","Hong Kong Style Cafe","Poutineries","Chicken Wings","British","Tempura","Fondue","Kosher","Cheese Shops","Cajun/Creole","Vegetarian","German","Scandinavian","Falafel","Korean","Curry Sausage","Haitian","Spanish","Rotisserie Chicken","Alsatian","Wine Bars","Colombian","Milkshake Bars","Singaporean","Art Restoration","Austrian","Moroccan","African"};
		PrintWriter writer=new PrintWriter("restautest1.json", "UTF-8");
		FileInputStream fstream = new FileInputStream("restautest.json");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		String strLine;
		//Read File Line By Line
		while ((strLine = br.readLine()) != null)   {
		  //System.out.println (strLine);
			if (stringContainsItemFromList(strLine,foodkeywords)) {
				writer.println(strLine);
		}

	}
		br.close();
		writer.close();  }*/
	
		public static boolean stringContainsItemFromList(String inputStr, String[] items) {
		return Arrays.stream(items).parallel().anyMatch(inputStr::contains);
	}
}

	

