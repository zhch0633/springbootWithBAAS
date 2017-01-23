import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.CreateCollectionOptions;
import org.bson.Document;
import org.junit.Test;
import utils.BaseMongoDBTest;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by zhch0633 on 18/01/17.
 *
 */

public class MongoDBConnectionTest extends BaseMongoDBTest{
    @Test
    public void testMongoDBConnection() throws Exception {
        MongoCollection<Document> collection = mongoDatabase.getCollection("testCollection");

        //drop collection
        collection.drop();
        mongoDatabase.createCollection("testCollection",new CreateCollectionOptions()
                .autoIndex(false));

        if(collection!=null){
            System.out.print("Connection to test Collection");
        }

        assertTrue(true);
    }
}
