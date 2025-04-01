import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import static utils.Constants.*;

public class Board extends JPanel implements ActionListener {

    private final List<Sprite> sprites;

    public Board() {
        setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
        setBackground(Color.GREEN);

        Player player = new Player();
        sprites = new ArrayList<>(List.of(player));

        new Timer(TICK_DELAY, this).start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Sprite sprite : sprites) {
            sprite.tick();
        }

        repaint();
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        for (Sprite sprite : sprites) {
            sprite.draw(graphics, this);
        }
    }
}
