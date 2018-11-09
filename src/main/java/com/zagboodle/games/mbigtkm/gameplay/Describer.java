package com.zagboodle.games.mbigtkm.gameplay;

import com.zagboodle.games.mbigtkm.locations.Direction;
import com.zagboodle.games.mbigtkm.locations.Exit;
import com.zagboodle.games.mbigtkm.locations.Section;

import java.util.ArrayList;

public class Describer {
    public static String describeExit(Exit exit) {
        StringBuilder sb = new StringBuilder();
        sb.append("* There is ");
        sb.append(exit.getDescription());
        sb.append(" to the ");
        sb.append(getDirectionAsString(exit.getDirection()));
        if (exit.getDescription().equals("a continuation")) {
            sb.append(" of ");
        } else {
            sb.append(" leading to ");
        }
        sb.append(exit.getLeadsTo().getDescription());
        return sb.toString();
    }

    public static String describeExits(ArrayList<Exit> exits) {
        StringBuilder sb = new StringBuilder();
        sb.append("You see the following exits:\n");
        for (Exit exit : exits) {
            sb.append(describeExit(exit));
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String describeSection(Section section) {
        return "You are in " +
                section.getDescription() +
                ".\n" +
                describeExits(section.getExits());
    }

    public static String getDirectionAsString(Direction direction) {
        switch (direction) {
            case NORTH:
                return "North";
            case SOUTH:
                return "South";
            case EAST:
                return "East";
            case WEST:
                return "West";
            case NORTHEAST:
                return "Northeast";
            case NORTHWEST:
                return "Northwest";
            case SOUTHEAST:
                return "Southeast";
            case SOUTHWEST:
                return "Southwest";
        }
        return null;
    }

}
