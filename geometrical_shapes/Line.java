package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Line implements Drawable {

    private final Point p1;
    private final Point p2;
    private final Color color;

    public Line(Point p1, Point p2, Color color) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = color;
    }


    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = Color.WHITE;
    }

    @Override
    public void draw(Displayable displayable) {
        int x1 = p1.getX();
        int y1 = p1.getY();
        int x2 = p2.getX();
        int y2 = p2.getY();

        int dx = x2 - x1;
        int dy = y2 - y1;

        int step = Math.max(Math.abs(dx), Math.abs(dy));

        double xInc = dx / (double) step;
        double yInc = dy / (double) step;

        double x = x1;
        double y = y1;

        for (int i = 0; i <= step; i++) {
            displayable.display((int) Math.round(x), (int) Math.round(y), this.color);
            x += xInc;
            y += yInc;
        }
    }

    public static Line random(int maxX, int maxY) {
        Random random = new Random();
        int x1 = random.nextInt(maxX);
        int y1 = random.nextInt(maxY);

        int x2 = random.nextInt(maxX);
        int y2 = random.nextInt(maxY);

        return new Line(new Point(x1, y1), new Point(x2, y2));
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }
}
