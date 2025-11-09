package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Pentagon implements Drawable {
    private Point[] points;
    private Color color;

    public Pentagon(Point[] points, Color color) {
        if (points.length != 5) {
            throw new IllegalArgumentException("Pentagon must have 5 points");
        }
        this.points = points;
        this.color = color;
    }

    public Pentagon(Point[] points) {
        this(points, Color.WHITE);
    }

    public static Pentagon random(int width, int height) {
        Random rand = new Random();
        Point center = Point.random(width, height);
        int radius = 20 + rand.nextInt(Math.min(width, height) / 5);
        double angleOffset = Math.toRadians(rand.nextInt(360));
        Color color = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
        Point[] points = new Point[5];  
        for (int i = 0; i < 5; i++) {
            double angle = 2 * Math.PI * i / 5 + angleOffset;
            int x = (int) (center.getX() + radius * Math.cos(angle));
            int y = (int) (center.getY() + radius * Math.sin(angle));
            points[i] = new Point(x, y, color);
        }
        return new Pentagon(points, color);
    }

    @Override
    public void draw(Displayable displayable) {
        for (int i = 0; i < 5; i++) {
            Point a = points[i];
            Point b = points[(i + 1) % 5];
            new Line(a, b, color).draw(displayable);
        }
    }
    
    @Override
    public Color getColor() {
        return color;
    }

}
