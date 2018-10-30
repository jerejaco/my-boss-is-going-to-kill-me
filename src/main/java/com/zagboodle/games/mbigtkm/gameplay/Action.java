package com.zagboodle.games.mbigtkm.gameplay;

import com.zagboodle.games.mbigtkm.locations.Direction;

public class Action {
    private ActionType type;
    private Direction direction;

    public Action(ActionType type) {
        this.type = type;
        this.direction = null;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public ActionType getType() {
        return type;
    }
}
