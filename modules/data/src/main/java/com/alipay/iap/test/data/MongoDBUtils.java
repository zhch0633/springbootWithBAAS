package com.alipay.iap.test.data;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.UpdateOptions;
import org.bson.conversions.Bson;

/**
 * Created by 淡斋 on 23/01/17.
 * Using this utils to make a mongodb easier to update.
 */
public class MongoDBUtils {
    public static void insertOrUpdate(MongoCollection mongoCollection, Bson bson){
        UpdateOptions options = new UpdateOptions().upsert(true);

        mongoCollection.updateOne(bson, bson, options);
    }
}
