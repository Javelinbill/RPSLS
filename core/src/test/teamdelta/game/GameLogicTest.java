package test.teamdelta.game;

import com.teamdelta.game.GameLogic;

import org.junit.Assert;
import org.junit.Test;

public class GameLogicTest extends Assert {

    @Test
    public void exists() {
        try {
            Class.forName("com.teamdelta.game.GameLogic");
        } catch(Exception e) {
            fail("Missing com.teamdelta.game.GameLogic");
        }
    }
}
