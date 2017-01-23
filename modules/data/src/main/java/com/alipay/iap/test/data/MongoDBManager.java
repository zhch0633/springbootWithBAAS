package com.alipay.iap.test.data;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.util.Collections;

/**
 * Created by zhch0633 on 18/01/17.
 * MongoBD Helper to get mongodb and make storage
 */

public class MongoDBManager {
    private MongoDatabase mongoDatabase;

    public static MongoDBManager getInstance(){
        return Host.MONGO_DB_MANAGER;
    }

    private MongoDBManager(){
        init();
    }

    public void init(){
        try {
            MongoCredential credential = MongoCredential.createCredential("user_zhch0633","heroku_n56xmgvw","user".toCharArray());
            ServerAddress serverAddress = new ServerAddress("ds127399.mlab.com",27399);
            MongoClient mongo = new MongoClient(serverAddress, Collections.singletonList(credential));

            mongoDatabase = mongo.getDatabase("heroku_n56xmgvw");
        } catch (Exception e){
            System.out.print("can not connect to mongodb");
        }
    }

    public MongoCollection getCollection(String collectionName){
        MongoCollection collection = mongoDatabase.getCollection(collectionName);

        if(collection==null){
            mongoDatabase.createCollection(collectionName);
            collection = mongoDatabase.getCollection(collectionName);
        }

        return collection;
    }

    private static class Host {
        static final MongoDBManager MONGO_DB_MANAGER = new MongoDBManager();
    }
}
