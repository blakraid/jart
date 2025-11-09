package geometrical_shapes;

import java.awt.Color;

public class Triangle implements Drawable {

    private final Point p1;
    private final Point p2;
    private final Point p3;
    private final Color color;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.color = Color.WHITE;
    }

    @Override
    public void draw(Displayable displayable) {

        Line l1 = new Line(this.p1, this.p2);
        Line l2 = new Line(this.p2, this.p3);
        Line l3 = new Line(this.p3, this.p1);

        l1.draw(displayable);
        l2.draw(displayable);
        l3.draw(displayable);

    }

    @Override
    public Color getColor() {
        return color;
    }
}
