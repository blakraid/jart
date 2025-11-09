package geometrical_shapes;

import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class Circle implements Drawable {
    private Point center;
    private int radius;
    private Color color;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
        this.color = getRandomColor();
    }

    public static Circle random(int maxWidth, int maxHeight) {
        Random r = new Random();
        Point randomCenter = Point.random(maxWidth, maxHeight);
        int randomRadius = 5 + r.nextInt(Math.min(maxWidth, maxHeight) / 2); 
        return new Circle(randomCenter, randomRadius);
    }

    public Point getCenter() { return center; }
    public int getRadius() { return radius; }
    public void setColor(Color color) { this.color = color; } 

    @Override
    public void draw(Displayable displayable) {
        if (displayable instanceof Image) {
            Image image = (Image) displayable;
            Graphics g = image.getGraphics2D();
            g.setColor(color);
            
            int x = center.getX();
            int y = center.getY();
            
            g.drawOval(x - radius, y - radius, radius * 2, radius * 2);
        }
    }

    @Override public Color getColor() { return color; }
}
