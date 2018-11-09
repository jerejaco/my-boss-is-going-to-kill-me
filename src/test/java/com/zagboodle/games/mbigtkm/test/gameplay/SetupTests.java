package com.zagboodle.games.mbigtkm.test.gameplay;

import com.zagboodle.games.mbigtkm.gameplay.Setup;
import com.zagboodle.games.mbigtkm.gameplay.Util;
import com.zagboodle.games.mbigtkm.locations.Direction;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SetupTests extends Util {

//    private static ArrayList<Location> locations;

    @BeforeAll
    static void init() {
        locations = Setup.execute();
    }

    @Test
    void test_Setup_location_description() {
        assertEquals("outside the front entrance", getLocation("outfront").getDescription());
    }

    @Test
    void test_Setup_Exit_LeadsTo() {
        assertEquals(getSection("backhall") , getSection("rik").getExit(Direction.EAST).getLeadsTo());
    }


}
