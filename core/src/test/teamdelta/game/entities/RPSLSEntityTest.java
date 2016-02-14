package test.teamdelta.game.entities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.teamdelta.game.entities.RPSLSEntity;

public class RPSLSEntityTest extends Assert {
    RPSLSEntity paperEntity;
    RPSLSEntity spockEntity;

    @Before
    public void load() {
        this.paperEntity = new RPSLSEntity("paper", new TextureRegion());
        this.spockEntity = new RPSLSEntity("spock", new TextureRegion());
    }

    @Test
    public void exists() {
        try {
            Class.forName("com.teamdelta.game.entities.RPSLSEntity");
        } catch(Exception e) {
            fail("Missing com.teamdelta.game.entities.RPSLSEntity");
        }
    }

    @Test
    public void hasGetName() {
        assertEquals(spockEntity.getName(), "spock");
    }

    @Test
    public void getImage() {
        assertNotNull(spockEntity.getImage());
    }

    @Test
    public void addFoe() {
        spockEntity.addFoe(paperEntity);

        assertNotNull(spockEntity.getFoes());
        assertEquals(spockEntity.getFoes().get(0), paperEntity);
    }

    @Test
    public void isFoe() {
        spockEntity.addFoe(paperEntity);

        assertTrue(spockEntity.isFoe(paperEntity));
        assertFalse(spockEntity.isFoe(spockEntity));
    }
}
