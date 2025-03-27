import javax.swing.*;
import java.awt.*;

import static utils.Constants.BOARD_HEIGHT;
import static utils.Constants.BOARD_WIDTH;

public class Board extends JPanel {

    public Board() {
        setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
        setBackground(Color.GREEN);
    }
}
