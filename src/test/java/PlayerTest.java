import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Player player;
    Item item;
    Room room1;
    @BeforeEach
    void setUp(){
        room1 = new Room("test", "tester", true);
        player = new Player(room1);
        item = new Item("item", "itemitem");
        player.inventory.add(item);

    }

    @Test
    void getItem() {
        player.getItem("item");
        Item expected = item;
        Item actual = player.getItem("item");

        assertEquals(actual, expected);
    }

}