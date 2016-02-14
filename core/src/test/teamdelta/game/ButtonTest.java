package test.teamdelta.game;

import com.teamdelta.game.Button;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

import org.junit.Test;
import org.junit.Assert;

public class ButtonTest extends Assert {
    private Button button;

    @Test
    public void exists() {
        try {
            Class.forName("com.teamdelta.game.Button");
        } catch(ClassNotFoundException e) {
            fail("Missing com.teamdeltagame.Button");
        }
    }

    @Test
    public void constructorShouldAcceptNoArguments() {
        try {
            button = new Button();
        } catch(Exception e) {
            fail("com.teamdelta.game.Button accepts 0 arguments");
        }
    }

    @Test
    public void constructorShouldAcceptThreeArguments() {
        try {
            button = new Button(new TextureRegion(), new TextureRegion(), new Rectangle());
        } catch(Exception e) {
            fail("com.teamdelta.game.Button accepts 3 arguments");
        }
    }
}
