import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.junit.Test;
import utils.BaseMongoDBTest;

/**
 * Created by 淡斋 on 23/01/17.
 * Use this test case to query documents
 */
public class MongoDBQueryDocumentTest extends BaseMongoDBTest {
    @Test
    public void testMongoDBQuery() throws Exception {

        MongoCollection<Document> collection = mongoDatabase.getCollection("testCollection");

        FindIterable<Document> findIterable = collection.find();

        for (Document aFindIterable : findIterable) {
            System.out.print(aFindIterable);
        }
    }
}
