package geometrical_shapes;

import java.awt.Color;

public class Rectangle implements Drawable {

    private final Point p1;
    private final Point p2;
    private final Color color;

    public Rectangle(Point p1, Point p2) {
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

        Line l1 = new Line(new Point(x1, y1), new Point(x2, y1));
        Line l2 = new Line(new Point(x2, y1), new Point(x2, y2));
        Line l3 = new Line(new Point(x2, y2), new Point(x1, y2));
        Line l4 = new Line(new Point(x1, y2), new Point(x1, y1));

        l1.draw(displayable);
        l2.draw(displayable);
        l3.draw(displayable);
        l4.draw(displayable);

    }

    @Override
    public Color getColor() {
        return this.color;
    }

}
