package com.zagboodle.games.mbigtkm.test.locations;

import com.zagboodle.games.mbigtkm.locations.Direction;
import com.zagboodle.games.mbigtkm.locations.Exit;
import com.zagboodle.games.mbigtkm.locations.Location;
import com.zagboodle.games.mbigtkm.locations.Section;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SectionTests {

    private static Location location = null;
    private static Section section = null;
    private static Section leadsto = null;
    private static Exit exit = null;

    @BeforeAll
    static void init() {
        location = new Location("location-name", "location description");
        section = location.getDefaultSection();
        location.addSection(new Section(location));
        leadsto = location.getSection(1);
        exit = new Exit("exit description", Direction.NORTH, leadsto);
        section.addExit(exit);
    }

    @Test
    void test_Section_getName() {
        assertEquals("location-name", section.getName());
    }

    @Test
    void test_Section_getDescription() {
        assertEquals("location description", section.getDescription());
    }

    @Test
    void test_Section_getExits() {
        assertNotNull(section.getExits());
    }

    @Test
    void test_Section_addExit() {
        section.addExit(new Exit("other exit description", Direction.WEST, leadsto));
        assertNotNull(section.getExit(Direction.WEST));
    }

    @Test
    void test_Section_getDefaultExit() {
        assertNotNull(section.getDefaultExit());
    }

    @Test
    void test_Section_getExit() {
        section.addExit(new Exit("other exit description", Direction.WEST, leadsto));
        assertNotNull(section.getExit(Direction.WEST));
    }

    @Test
    void test_Section_getLocation() {
        assertNotNull(section.getLocation());
    }
}
