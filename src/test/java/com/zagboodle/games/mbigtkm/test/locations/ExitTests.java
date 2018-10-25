package com.zagboodle.games.mbigtkm.test.locations;

import com.zagboodle.games.mbigtkm.locations.Direction;
import com.zagboodle.games.mbigtkm.locations.Exit;
import com.zagboodle.games.mbigtkm.locations.Location;
import com.zagboodle.games.mbigtkm.locations.Section;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ExitTests {

    private static Location location = null;
    private static Section section = null;
    private static Exit exit = null;

    @BeforeAll
    static void init() {
        location = new Location("location-name", "location description");
        section = location.getDefaultSection();
        exit = new Exit("exit description", Direction.NORTH, section);
    }

    @Test
    void test_Exit_getDescription() {
        assertEquals("exit description", exit.getDescription());
    }

    @Test
    void test_Exit_getDirection() {
        assertEquals(Direction.NORTH, exit.getDirection());
    }

    @Test
    void test_Exit_getLeadsTo() {
        assertNotNull(exit.getLeadsTo());
    }

}
