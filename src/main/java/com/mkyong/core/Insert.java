package com.mkyong.core;

import java.net.UnknownHostException;
import java.util.Scanner;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class Insert 
{
    public static void main( String[] args )
    {
        try {
        	MongoClient mongo = new MongoClient( "localhost" , 27017 );
			DB db = mongo.getDB("test");
			DBCollection worldCitiesCollection = db.getCollection("worldcities");
			BasicDBObject newCity = new BasicDBObject();
			Scanner in = new Scanner(System.in); 
			System.out.println("Enter \"Country\":");
			String s = in.nextLine();
			newCity.put("Country", s);

			System.out.println("Enter \"City\" :");
			s = in.nextLine();
			newCity.put("City", s);
			
			System.out.println("Enter \"AccentCity\" :");
			s = in.nextLine();
			newCity.put("AccentCity" , s);
			
			System.out.println("Enter \"Region\" :");
			s = in.nextLine();
			newCity.put("Region" , Integer.parseInt(s));
			
			System.out.println("Enter \"Population\" :");
			s = in.nextLine();
			newCity.put("Population"  , Integer.parseInt(s));
			
			System.out.println("Enter \"Latitude\" :");
			s = in.nextLine();
			newCity.put("Latitude" , Double.parseDouble(s));
			
			System.out.println("Enter \"Longitude\" :");
			s = in.nextLine();
			newCity.put("Longitude" , Double.parseDouble(s));
			
			worldCitiesCollection.insert(newCity);
			
				System.out.println("Closing connection...");
				mongo.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
    }
}
