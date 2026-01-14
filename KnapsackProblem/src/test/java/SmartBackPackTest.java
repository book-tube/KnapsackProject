import org.example.Item;
import org.example.SmartBackpack;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SmartBackpackTest {

    @Test
    void packAll_shouldPackOptimalWeight() {
        SmartBackpack backpack = new SmartBackpack(10);

        List<Item> items = List.of(
                new Item("A", 6),
                new Item("B", 5),
                new Item("C", 4)
        );

        boolean allPacked = backpack.packAll(items);

        // Optimales Gewicht ist 10 (6 + 4).
        assertFalse(allPacked, "Nicht alle Items passen rein, deshalb false");
        assertEquals(10.0, backpack.getCurrentWeight(), "Rucksack muss optimal mit 10g gepackt sein");
    }
}