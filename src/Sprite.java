import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class Sprite {

    private Point pos;
    private Dimension size;
    private BufferedImage image;

    public Sprite(String imagePath, int x, int y) {
        pos = new Point(x, y);
        loadImage(imagePath);
        size = new Dimension(image.getWidth(), image.getHeight());
    }

    public Sprite(String imagePath, int x, int y, int width, int height) {
        pos = new Point(x, y);
        loadImage(imagePath);
        size = new Dimension(width, height);
    }

    private void loadImage(String imagePath) {
        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException exception) {
            System.err.println("Error opening image file: " + imagePath);
        }
    }

    public Point getPos() {
        return pos;
    }

    public Dimension getSize() {
        return size;
    }

    public abstract void tick();
}
