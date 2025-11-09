package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Point implements Drawable {
    private int x;
    private int y;
    private Color color;

    public Point(int x, int y) {
        this(x, y, Color.WHITE);
    }

    public Point(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public static Point random(int width, int height) {
        Random rand = new Random();
        int x = rand.nextInt(width);
        int y = rand.nextInt(height);
        Color color = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
        return new Point(x, y, color);
    }

    @Override
    public void draw(Displayable displayable) {
        displayable.display(x, y, color);
    }

    @Override
    public Color getColor() {
        return color;
    }

    public int getX() { return x; }
    public int getY() { return y; }
}
