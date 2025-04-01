import java.awt.event.KeyEvent;
import java.util.Set;

import static utils.Constants.*;

public class Player extends Sprite {
    public Player() {
        super(PLAYER_IMAGE_PATH, 0, 0, PLAYER_WIDTH, PLAYER_HEIGHT);
    }

    @Override
    public void tick() {

    }

    public void handleActiveKeys(Set<Integer> activeKeyCodes) {
        if (activeKeyCodes.contains(KeyEvent.VK_UP)) {
            getPos().y -= 10;
        }
        if (activeKeyCodes.contains(KeyEvent.VK_DOWN)) {
            getPos().y += 10;
        }
        if (activeKeyCodes.contains(KeyEvent.VK_LEFT)) {
            getPos().x -= 10;
        }
        if (activeKeyCodes.contains(KeyEvent.VK_RIGHT)) {
            getPos().x += 10;
        }
    }
}
