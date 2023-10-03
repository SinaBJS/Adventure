import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Player player;
    Item item;
    Food food;
    Room room1;
    Room room2;
    @BeforeEach
    void setUp(){
        room1 = new Room("room1", "room number 1", true);
        player = new Player(room1, 100);
        item = new Item("item", "itemitem");
        food = new Food("banan", "itemitem", 20);
        player.inventory.add(item);

    }

    @Test
    void eat(){
        player.eat("");
        int expected = 120;
        int actual = player.health();
        assertEquals(expected, actual);
        assertNull(food);
    }
    @Test
    void roomConnection(){
        room2 = new Room("room2", "room number 2", true);

        room1.setWestRoom(room2);

        assertEquals(room1.getName(), room2.east.getName());
    }
}