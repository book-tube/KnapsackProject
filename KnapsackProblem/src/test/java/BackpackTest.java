import org.example.Backpack;
import org.example.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackpackTest {

    @Test
    void maxWeightCannotBeExceeded() {
        Backpack backpack = new Backpack(10);

        Item item1 = new Item("A", 6);
        Item item2 = new Item("B", 5);

        assertTrue(backpack.pack(item1), "6g should fit into a 10g backpack");
        assertFalse(backpack.pack(item2), "Adding 5g after 6g must fail because it exceeds 10g");

        assertEquals(6.0, backpack.getCurrentWeight(), 0.0001,
                "Weight must remain 6g after the failed pack attempt");
    }
}
