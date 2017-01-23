import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.junit.Test;
import utils.BaseMongoDBTest;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by 淡斋 on 23/01/17.
 * Mongo DB insert test
 */
public class MongoDBInsertTest extends BaseMongoDBTest{
    @Test
    public void testMongoDBInsert() throws Exception {

        MongoCollection<Document> collection = mongoDatabase.getCollection("testCollection");

        Document newDocument = new Document("title","MongoDB")
                .append("description", "database")
                .append("likes", 100)
                .append("by", "Fly");

        List<Document> documents = new ArrayList<>();
        documents.add(newDocument);

        collection.insertMany(documents);
        System.out.print("Insert document success");

        assertTrue(true);
    }
}
