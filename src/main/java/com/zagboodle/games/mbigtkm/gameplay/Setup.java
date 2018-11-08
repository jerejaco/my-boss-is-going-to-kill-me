package com.zagboodle.games.mbigtkm.gameplay;

import com.zagboodle.games.mbigtkm.locations.Direction;
import com.zagboodle.games.mbigtkm.locations.Exit;
import com.zagboodle.games.mbigtkm.locations.Location;
import com.zagboodle.games.mbigtkm.locations.Section;

import java.util.ArrayList;

public class Setup extends Util {
    public static ArrayList<Location> execute() {
        locations = new ArrayList<Location>();
        createLocations();
        addSections();
        addExits();
        return locations;
    }

    private static void createLocations() {

        locations.add(new Location("outfront", "outside the front entrance"));
        locations.add(new Location("reception", "the Reception Area"));
        locations.add(new Location("ash", "Ash's Office"));
        locations.add(new Location("vyvyan", "Vyvyan's Office"));
        locations.add(new Location("rik", "Rik's Office"));
        locations.add(new Location("neil", "Neil's Office"));
        locations.add(new Location("mike", "Mike's Office"));
        locations.add(new Location("jerzy", "Jerzy's Office"));
        locations.add(new Location("lister", "Lister's Office"));
        locations.add(new Location("rimmer", "Rimmer's Office"));
        locations.add(new Location("kryten", "Kryten's Office"));
        locations.add(new Location("cat", "Cat's Office"));
        locations.add(new Location("holly", "Holly's Office"));
        locations.add(new Location("mal", "Mal's Office"));
        locations.add(new Location("zoe", "Zoe's Office"));
        locations.add(new Location("river", "River's Office"));
        locations.add(new Location("kaylee", "Kaylee's Office"));
        locations.add(new Location("jayne", "Jayne's Office"));
        locations.add(new Location("storage1", "Storage room 1"));
        locations.add(new Location("storage2", "Storage room 2"));
        locations.add(new Location("outback", "outside the back entrance"));
        locations.add(new Location("backhall", "the back hallway"));
        locations.add(new Location("exithall", "the exit hallway"));
        locations.add(new Location("lefthall", "the left hallway"));
        locations.add(new Location("righthall", "the right hallway"));
        locations.add(new Location("ladies", "the ladies room"));
        locations.add(new Location("mens", "the men's room"));
    }

    private static void addSections() {
        Location vyvyan = getSection("vyvyan").getLocation();
        Section vyvyan2 = new Section(vyvyan);
        vyvyan.addSection(vyvyan2);

        Location backhall = getSection("backhall").getLocation();
        Section backhall1 = new Section(backhall);
        backhall.addSection(backhall1);
        Section backhall2 = new Section(backhall);
        backhall.addSection(backhall2);
    }

    private static void addExits() {
        getSection("outfront")
                .addExit(new Exit(Direction.NORTH, getSection("reception")));

        getSection("reception")
                .addExit(new Exit(Direction.SOUTH, getSection("outfront")))
                .addExit(new Exit(Direction.WEST, getSection("ash")))
                .addExit(new Exit(Direction.EAST, getSection("lister")));

        getSection("ash")
                .addExit(new Exit(Direction.WEST, getSection("vyvyan")))
                .addExit(new Exit(Direction.EAST, getSection("reception")));

        getSection("vyvyan")
                .addExit(new Exit("a continuation",
                        Direction.NORTH, getSection("vyvyan", 1)))
                .addExit(new Exit(Direction.EAST, getSection("ash")));

        getSection("vyvyan", 1)
                .addExit(new Exit("a continuation",
                        Direction.SOUTH, getSection("vyvyan")))
                .addExit(new Exit(Direction.EAST, getSection("lefthall")));

        getSection("lefthall")
                .addExit(new Exit(Direction.SOUTHWEST, getSection("ladies")))
                .addExit(new Exit(Direction.SOUTHEAST, getSection("mens")))
                .addExit(new Exit(Direction.WEST, getSection("vyvyan", 1)))
                .addExit(new Exit("an opening", Direction.NORTH, getSection("backhall")))
                .addExit(new Exit(Direction.EAST, getSection("jerzy")));

        getSection("backhall")
                .addExit(new Exit(Direction.WEST, getSection("rik")))
                .addExit(new Exit(Direction.NORTHWEST, getSection("mal")))
                .addExit(new Exit(Direction.NORTHEAST, getSection("zoe")))
                .addExit(new Exit("a continuation", Direction.EAST, getSection("backhall", 1)))
                .addExit(new Exit("an opening",
                        Direction.SOUTH, getSection("lefthall")));

        getSection("backhall", 1)
                .addExit(new Exit("a continuation", Direction.WEST, getSection("backhall")))
                .addExit(new Exit(Direction.NORTHWEST, getSection("river")))
                .addExit(new Exit(Direction.NORTHEAST, getSection("kaylee")))
                .addExit(new Exit("a continuation", Direction.EAST, getSection("backhall", 2)))
                .addExit(new Exit(Direction.SOUTHWEST, getSection("neil")))
                .addExit(new Exit(Direction.SOUTHEAST, getSection("mike")));

        getSection("backhall", 2)
                .addExit(new Exit("a continuation", Direction.WEST, getSection("backhall", 1)))
                .addExit(new Exit(Direction.NORTHWEST, getSection("jayne")))
                .addExit(new Exit("an opening",
                        Direction.NORTHEAST, getSection("exithall")))
                .addExit(new Exit("an opening",
                        Direction.SOUTH, getSection("righthall")));

        getSection("jerzy")
                .addExit(new Exit(Direction.WEST, getSection("lefthall")));

        getSection("rik")
                .addExit(new Exit(Direction.EAST, getSection("backhall")));

        getSection("mal")
                .addExit(new Exit(Direction.SOUTH, getSection("backhall")));

        getSection("zoe")
                .addExit(new Exit(Direction.SOUTH, getSection("backhall")));

        getSection("river")
                .addExit(new Exit(Direction.SOUTH, getSection("backhall", 1)));

        getSection("kaylee")
                .addExit(new Exit(Direction.SOUTH, getSection("backhall", 1)));

        getSection("neil")
                .addExit(new Exit(Direction.NORTH, getSection("backhall", 1)));

        getSection("mike")
                .addExit(new Exit(Direction.NORTH, getSection("backhall", 1)));

        getSection("jayne")
                .addExit(new Exit(Direction.SOUTH, getSection("backhall", 2)));

        getSection("exithall")
                .addExit(new Exit(Direction.SOUTH, getSection("backhall", 2)))
                .addExit(new Exit(Direction.NORTH, getSection("outback")))
                .addExit(new Exit(Direction.NORTHEAST, getSection("storage1")))
                .addExit(new Exit(Direction.SOUTHEAST, getSection("storage2")));

        getSection("storage1")
                .addExit(new Exit(Direction.WEST, getSection("exithall")));

        getSection("storage2")
                .addExit(new Exit(Direction.WEST, getSection("exithall")));

        getSection("outback")
                .addExit(new Exit(Direction.SOUTH, getSection("exithall")));

        getSection("righthall")
                .addExit(new Exit("an opening", Direction.NORTH, getSection("backhall", 2)))
                .addExit(new Exit(Direction.NORTHEAST, getSection("holly")))
                .addExit(new Exit("an opening", Direction.EAST, getSection("cat")))
                .addExit(new Exit("an opening", Direction.SOUTHEAST, getSection("kryten")))
                .addExit(new Exit("an opening", Direction.SOUTH, getSection("rimmer")))
                .addExit(new Exit(Direction.SOUTHWEST, getSection("lister")));

        getSection("holly")
                .addExit(new Exit(Direction.WEST, getSection("righthall")));

        getSection("cat")
                .addExit(new Exit("an opening", Direction.WEST, getSection("righthall")))
                .addExit(new Exit("an opening", Direction.SOUTH, getSection("kryten")))
                .addExit(new Exit("an opening", Direction.SOUTHWEST, getSection("rimmer")));

        getSection("lister")
                .addExit(new Exit(Direction.NORTH, getSection("righthall")))
                .addExit(new Exit(Direction.WEST, getSection("reception")));

        getSection("rimmer")
                .addExit(new Exit("an opening", Direction.NORTH, getSection("righthall")))
                .addExit(new Exit("an opening", Direction.EAST, getSection("kryten")))
                .addExit(new Exit("an opening", Direction.NORTHEAST, getSection("cat")));

        getSection("kryten")
                .addExit(new Exit("an opening", Direction.NORTHWEST, getSection("righthall")))
                .addExit(new Exit("an opening", Direction.NORTH, getSection("cat")))
                .addExit(new Exit("an opening", Direction.WEST, getSection("rimmer")));

        getSection("ladies")
                .addExit(new Exit(Direction.NORTH, getSection("lefthall")));

        getSection("mens")
                .addExit(new Exit(Direction.NORTH, getSection("lefthall")));

    }

}
