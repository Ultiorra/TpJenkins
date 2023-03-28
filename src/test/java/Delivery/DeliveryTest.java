package Delivery;

import livraison.Delivery;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class DeliveryTest {


    @Test
    public void testStandardCost() {
        double cost = Delivery.calculateCost(30.0, 5.0);
        assertEquals(10.0, cost, 0.001);
    }

    @Test
    public void testAdditionalCost() {
        double cost = Delivery.calculateCost(70.0, 5.0);
        assertEquals(20.0, cost, 0.001);
    }

    @Test
    public void test10To25Kg() {
        double cost = Delivery.calculateCost(30.0, 15.0);
        assertEquals(12.0, cost, 0.001);
    }

    @Test
    public void testAbove25Kg() {
        double cost = Delivery.calculateCost(30.0, 30.0);
        assertEquals(15.0, cost, 0.001);
    }

    @Test
    public void testNegativeDistance() {
        assertThrows(IllegalArgumentException.class, () -> {
            Delivery.calculateCost(-30.0, 5.0);
        });
    }

    @Test
    public void testNegativeWeight() {
        assertThrows(IllegalArgumentException.class, () -> {
            Delivery.calculateCost(30.0, -5.0);
        });
    }
}