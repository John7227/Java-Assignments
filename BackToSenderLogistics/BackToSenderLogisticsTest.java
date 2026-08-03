import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BackToSenderLogisticsTest {

    @Test
    public void test80() {
    
    assertEquals(45000, BackToSenderLogistics.numberOfSuccessfulDelivery(80));

    }

    @Test
    public void test25() {

    assertEquals(9000, BackToSenderLogistics.numberOfSuccessfulDelivery(25));

    }

    @Test
    public void test50() {
    
    assertEquals(15000, BackToSenderLogistics.numberOfSuccessfulDelivery(50));
    }


}

