package homework_16;
import homework_13.coffe.order.Order;

public class OrderTest {
    @Test
    public void testOrderConstructor() {
        Order order = new Order(1, "Test");
        assertEquals(1, order.getNumber());
        assertEquals("Test", order.getName());
    }

    @Test
    public void testGettersAndSetters() {
        Order order = new Order(1, "Test");
        order.setNumber(2);
        order.setName("NewTest");
        assertEquals(2, order.getNumber());
        assertEquals("NewTest", order.getName());
    }

    @Test
    public void testToString() {
        Order order = new Order(1, "Test");
        assertEquals("1 | Test", order.toString());
    }
}
