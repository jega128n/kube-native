import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.docker.demo.model.Product; 

class apiUnitTests {
 
    @Test
    void justAnExample() {
    	Product testProd = new Product((long)9999, "testWidget", 19.96);
        assertEquals(testProd.getProductId(), 9999);
    }
}
