package com.zagboodle.games.mbigtkm.test.gameplay;

import com.zagboodle.games.mbigtkm.gameplay.Util;
import com.zagboodle.games.mbigtkm.locations.Location;
import com.zagboodle.games.mbigtkm.locations.Section;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UtilTests {

    private static ArrayList<Location> locations;
    private static Location location1;
    private static Location location2;
    private static Section section2;

    @BeforeAll
    static void init() {
        locations = new ArrayList<Location>();
        location1 = new Location("location1", "Location One");
        location2 = new Location("location2", "Location Two");

        section2 = new Section(location2);
        location2.addSection(section2);

        locations.add(location1);
        locations.add(location2);

        Util.setLocations(locations);
    }

    @Test
    void test_Util_getDefaultSection() {
        assertEquals(location2.getDefaultSection(), Util.getDefaultSection("location2"));
    }

    @Test
    void test_Util_getSection() {
        assertEquals(section2, Util.getSection("location2", 1));
    }
}
