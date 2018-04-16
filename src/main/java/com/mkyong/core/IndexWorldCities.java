package com.mkyong.core;

import java.net.UnknownHostException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class IndexWorldCities 
{
    public static void main( String[] args )
    {
        try {
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
				DB db = mongo.getDB("test");
				DBCollection worldCitiesCollection = db.getCollection("worldcities");
				System.out.println( "Droping existing indexes for worldcities" );
				worldCitiesCollection.dropIndexes();
				System.out.println( "Creating indexes for worldcities" );
				worldCitiesCollection.createIndex(new BasicDBObject("Longitude", 1));
				worldCitiesCollection.createIndex(new BasicDBObject("Latitude", 1));
				worldCitiesCollection.createIndex(new BasicDBObject("City", 1));
				System.out.println("Total Indexes Created :" + worldCitiesCollection.getCount() + " for Longitude, Latitude and City name");
				mongo.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
    }
}
