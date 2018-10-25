package com.zagboodle.games.mbigtkm.locations;

public class Exit {

    private String description;
    private Direction direction;
    private Section leadsTo;

    public Exit(String description, Direction direction, Section leadsTo) {
        this.description = description;
        this.direction = direction;
        this.leadsTo = leadsTo;
    }

    public String getDescription() {
        return description;
    }

    public Direction getDirection() {
        return direction;
    }

    public Section getLeadsTo() {
        return leadsTo;
    }
}
