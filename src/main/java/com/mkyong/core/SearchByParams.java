package com.mkyong.core;

import java.net.UnknownHostException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class SearchByParams 
{
    public static void main( String[] args )
    {
    	if(args.length %2 != 0) {
    		System.out.println( "Wrong number of argumens : " + args.length );
    	} else {
        try {
        	MongoClient mongo = new MongoClient( "localhost" , 27017 );
			DB db = mongo.getDB("test");
			DBCollection worldCitiesCollection = db.getCollection("worldcities");
			boolean search;
        	for(int i=0; i<args.length; i++) {
        		search = true;
        		System.out.println( "First 10 Results for : " + args[i] + args[i+1] + " ordered by city name " );
        		BasicDBObject searchQuery = new BasicDBObject();
        		if(args[i+1].charAt(0)=='>') {
        			searchQuery.put(args[i], new BasicDBObject("$gt", Integer.parseInt(args[i+1].substring(1))));
        		} else if(args[i+1].charAt(0)=='<') {
        			searchQuery.put(args[i], new BasicDBObject("$lt", Integer.parseInt(args[i+1].substring(1))));
        		} else if(args[i+1].charAt(0)=='=') {
        			searchQuery.put(args[i], args[i+1].substring(1));
        		} else {
        			search = false;
        			System.out.println("Wrong arguments for " + i + " " + (i+1));
        		}
        		
        		if(search) {
        			DBCursor cursor = worldCitiesCollection.find(searchQuery).limit(10).sort(new BasicDBObject("City", 1));
    				while (cursor.hasNext()) {
    					DBObject cs = cursor.next();
    					String latitude = cs.get("Latitude").toString();
    					String longitude = cs.get("Longitude").toString();
    					
    					System.out.println("Search result : " + cs);
    					System.out.println("Google maps link : \n " + "https://www.google.pl/maps/search/"+latitude + "," + longitude);
    				}
        		}
        		i++;
        	}
				System.out.println("Closing connection...");
				mongo.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
    }
    }
}
