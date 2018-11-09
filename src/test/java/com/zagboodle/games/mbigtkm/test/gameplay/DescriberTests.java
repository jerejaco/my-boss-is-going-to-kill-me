package com.zagboodle.games.mbigtkm.test.gameplay;

import com.zagboodle.games.mbigtkm.gameplay.Describer;
import com.zagboodle.games.mbigtkm.gameplay.Setup;
import com.zagboodle.games.mbigtkm.gameplay.Util;
import com.zagboodle.games.mbigtkm.locations.Direction;
import com.zagboodle.games.mbigtkm.locations.Exit;
import com.zagboodle.games.mbigtkm.locations.Location;
import com.zagboodle.games.mbigtkm.locations.Section;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import sun.security.krb5.internal.crypto.Des;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DescriberTests extends Util {

    private static Location vyvyanLoc;
    private static Section vyvyanSec;
    private static ArrayList<Exit> exits;
    private static Exit exitToAshOffice;

    @BeforeAll
    static void init() {
        locations = Setup.execute();
        vyvyanLoc = locations.get(3);
        vyvyanSec = vyvyanLoc.getDefaultSection();
        exits = vyvyanSec.getExits();
        exitToAshOffice = exits.get(1);
    }

    @Test
    void test_Describer_describeSection() {
        assertEquals("You are in Vyvyan's Office.\n" +
                "You see the following exits:\n" +
                "* There is a continuation to the North of Vyvyan's Office\n" +
                "* There is door to the East leading to Ash's Office\n", Describer.describeSection(vyvyanSec));
    }

    @Test
    void test_Describer_describeExits() {
        assertEquals("You see the following exits:\n" +
                "* There is a continuation to the North of Vyvyan's Office\n" +
                "* There is door to the East leading to Ash's Office\n", Describer.describeExits(exits));
    }

    @Test
    void test_Describer_describeExit() {
        assertEquals("* There is door to the East leading to Ash's Office", Describer.describeExit(exitToAshOffice));
    }

    @Test
    void test_Describer_getDirectionAsString() {
        assertEquals("Northwest", Describer.getDirectionAsString(Direction.NORTHWEST));
    }


//    You see the following exits:
//            * There is a continuation to the North of Vyvyan's Office
//            * There is door to the East leading to Ash's Office

}
