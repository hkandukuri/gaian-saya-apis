package com.gaian.automation.database;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.util.Arrays;

import org.bson.Document;

/**
 * Created by hkandukuri on 09/12/2017.
 */
public class MongoConnection {

	/***
	 * 
	 * @param hostname
	 *            The address of the Server or mention as localhost, if on local
	 *            server.
	 * @param username
	 *            the user name
	 * @param password
	 *            the user's password
	 * @param database
	 *            the database where the user is defined
	 * @return a Mongo instance based on a (single) mongodb node.
	 */
	public MongoClient MakeConnection(String hostname, String username, String password, String database) {

		MongoCredential credential = MongoCredential.createCredential(username, database, password.toCharArray());
		return new MongoClient(new ServerAddress(hostname), Arrays.asList(credential));
	}

	/***
	 * 
	 * @param hostname
	 *            the database's host address
	 * @return a Mongo instance based on a (single) mongodb node.
	 */
	public MongoClient MakeConnection(String hostname) {
		return new MongoClient(hostname);
	}

	/***
	 * @param hostname
	 *            the database's host address
	 * @param port
	 *            the port on which the database is running
	 * @return a Mongo instance based on a (single) mongodb node.
	 */
	public MongoClient MakeConnection(String hostname, int port) {
		return new MongoClient(hostname, port);
	}

	/***
	 * 
	 * @param dbName
	 *            the name of the database to retrieve
	 * @param client
	 *            a Mongo instance to query
	 * @return a MongoDatabase representing the specified database
	 */
	public MongoDatabase GetMongoDatabase(String dbName, MongoClient client) {
		return client.getDatabase(dbName);
	}

	/***
	 * 
	 * @param collectionName
	 *            the name of the collection to return
	 * @param mongoDB
	 *            MongoDatabase of the collection.
	 * @return the collection
	 */
	public MongoCollection<Document> GetCollection(String collectionName, MongoDatabase mongoDB) {
		return mongoDB.getCollection(collectionName);
	}
}
