package utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;
import org.junit.Before;

import java.util.Collections;

/**
 * Created by 淡斋 on 23/01/17.
 *
 */
public class BaseMongoDBTest {
    protected MongoDatabase mongoDatabase;

    @Before
    public void prepareTest(){
        MongoCredential credential = MongoCredential.createCredential("user_zhch0633","heroku_n56xmgvw","user".toCharArray());
        ServerAddress serverAddress = new ServerAddress("ds127399.mlab.com",27399);
        MongoClient mongo = new MongoClient(serverAddress, Collections.singletonList(credential));

        mongoDatabase = mongo.getDatabase("heroku_n56xmgvw");
    }
}
