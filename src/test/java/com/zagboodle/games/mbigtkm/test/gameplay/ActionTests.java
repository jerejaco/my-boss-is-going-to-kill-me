package com.zagboodle.games.mbigtkm.test.gameplay;

import com.zagboodle.games.mbigtkm.gameplay.Action;
import com.zagboodle.games.mbigtkm.gameplay.ActionType;
import com.zagboodle.games.mbigtkm.locations.Direction;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActionTests {

    private static ActionType type;
    private static Action action;
    private static Direction direction;

    @BeforeAll
    static void init() {
        type = ActionType.MOVE;
        direction = Direction.NORTH;
        action = new Action(type);
        action.setDirection(direction);
    }

    @Test
    void test_Action_getActionType() {
        assertEquals(ActionType.MOVE, action.getType());
    }

    @Test
    void test_Action_getDirection() {
        assertEquals(Direction.NORTH, action.getDirection());
    }

}
