import org.example.Item;
import org.example.OptimalBackpack;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OptimalBackpackTest {

    @Test
    void packAll_shouldReturnTrue_whenAllItemsFit_twoItems() {
        OptimalBackpack backpack = new OptimalBackpack(10);

        Item a = new Item("A", 6);
        Item b = new Item("B", 4);

        boolean allPacked = backpack.packAll(List.of(a, b));

        assertTrue(allPacked, "Alle Items passen rein -> true");
        assertEquals(10.0, backpack.getCurrentWeight(), "Gewicht muss 10 sein");
        assertEquals(2, backpack.getItems().size());
    }

    @Test
    void packAll_shouldReturnFalse_andPickBestWeight_twoItems() {
        OptimalBackpack backpack = new OptimalBackpack(10);

        Item a = new Item("A", 6);
        Item b = new Item("B", 5);

        boolean allPacked = backpack.packAll(List.of(a, b));

        assertFalse(allPacked, "Nicht alle Items passen rein -> false");
        assertEquals(6.0, backpack.getCurrentWeight(), "OptimalBackpack muss das beste Gewicht wählen -> 6");
        assertEquals(1, backpack.getItems().size(), "Nur ein Item sollte drin sein");
    }
}
