package com.mkyong.core;

import java.net.UnknownHostException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class Reset 
{
    public static void main( String[] args )
    {
        try {
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
				DB db = mongo.getDB("test");
				DBCollection worldCitiesCollection = db.getCollection("worldcities");
				System.out.println( "Droping collection worldcities" );
				worldCitiesCollection.drop();
				System.out.println("Collection worldcities dropped succesfuly");
				mongo.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
    }
}
