import org.example.Item;
import org.example.SimpleBackpack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackpackTest {

    @Test
    void maxWeightCannotBeExceeded() {
        SimpleBackpack backpack = new SimpleBackpack(10);

        Item item1 = new Item("A", 6);
        Item item2 = new Item("B", 5);

        assertTrue(backpack.pack(item1), "6g wird in den Rucksack passen");
        assertFalse(backpack.pack(item2), "5g hinzufügen wird nicht gehen, da es über die Kapazität des Rucksacks geht");

        assertEquals(6.0, backpack.getCurrentWeight(),"Gewicht des Rucksacks muss 6g sein");
    }
}
