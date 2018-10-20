package com.zagboodle.games.mbigtkm.test.locations;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import com.zagboodle.games.mbigtkm.locations.*;

class LocationTests {

    private static Location location = null;

    @BeforeAll
    static void init() {
        location = new Location("location-name", "location description");
    }

    @Test
    void test_location_getName() {
        assertEquals("location-name", location.getName());
    }

    @Test
    void test_location_getDescription() {
        assertEquals("location description", location.getDescription());
    }

    @Test
    void test_location_getDefaultSection_isNotNull() {
        assertNotNull(location.getDefaultSection());
    }

    @Test
    void test_location_getSection_isNotNull() {
        location.addSection(new Section());
        assertNotNull(location.getSection(1));
    }

}
