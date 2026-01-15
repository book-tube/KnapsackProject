import org.example.GreedyBackpack;
import org.example.Item;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GreedyBackpackTest {

    @Test
    void packAll_shouldReturnTrue_whenAllItemsFit() {
        GreedyBackpack backpack = new GreedyBackpack(10);

        Item a = new Item("A", 6);
        Item b = new Item("B", 4);

        boolean allPacked = backpack.packAll(List.of(a, b));

        assertTrue(allPacked, "Alle Items passen rein -> true");
        assertEquals(10.0, backpack.getCurrentWeight(), "Gewicht muss 10 sein");
        assertEquals(2, backpack.getItems().size());
    }

    @Test
    void packAll_shouldReturnFalse_andShowGreedyCanMissBetterCombination() {
        GreedyBackpack backpack = new GreedyBackpack(10);

        Item a = new Item("A", 8);
        Item b = new Item("B", 6);
        Item c = new Item("C", 4);

        boolean allPacked = backpack.packAll(List.of(a, b, c));

        assertFalse(allPacked, "Nicht alle Items passen rein -> false");
        assertEquals(8.0, backpack.getCurrentWeight(), "Greedy packt hier nur 8");
        assertEquals(1, backpack.getItems().size(), "Nur ein Item sollte drin sein");
    }
}
