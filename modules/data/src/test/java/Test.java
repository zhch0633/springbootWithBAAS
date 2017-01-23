import com.alipay.iap.test.data.MongoDBManager;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import utils.BaseMongoDBTest;

/**
 * Created by ali-classmate on 23/01/17.
 */
public class Test extends BaseMongoDBTest {
    @org.junit.Test
    public void run(){
        MongoCollection collection = MongoDBManager.getInstance().getCollection("users");
        collection.insertOne(new Document("userID","00002"));


        FindIterable<Document> findIterable = collection.find();

        for (Document aFindIterable : findIterable) {
            System.out.print(aFindIterable);
        }
    }
}
