package homework_16;

import homework_13.coffe.order.CoffeeOrderBoard;

public class CoffeeOrderBoardTest {
    private CoffeeOrderBoard board;

    @Before
    public void setUp() {
        board = new CoffeeOrderBoard();
        board.add("Test1");
        board.add("Test2");
        board.add("Test3");
    }

    @Test
    public void testAdd() {
        assertEquals(1, board.deliver().getNumber());
        assertEquals(2, board.deliver().getNumber());
        assertEquals(3, board.deliver().getNumber());
    }

    @Test
    public void testDeliverByNumber() {
        assertEquals(1, board.deliver(1).getNumber());
        assertEquals(3, board.deliver(3).getNumber());
        assertNull(board.deliver(2)); // Non-existent order
    }

    @Test
    public void testDraw() {
        assertEquals("=============\nNum | Name\n1 | Test1\n2 | Test2\n3 | Test3\n", board.draw());
    }
}
