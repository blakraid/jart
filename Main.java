import geometrical_shapes.*;

public class Main {
    public static void main(String[] args) {
        Image image = new Image(1000, 1000);

        Rectangle rectangle = new Rectangle(new Point(150, 300), new Point(50, 60));
        rectangle.draw(image);

        Triangle triangle = new Triangle(new Point(500, 500), new Point(250, 700), new Point(700, 800));
        triangle.draw(image);
        Line singleLine = Line.random(image.getWidth(),image.getHeight());
        singleLine.draw(image);

        Point singlePoint = Point.random(image.getWidth(), image.getHeight());
        singlePoint.draw(image);

        for (int i = 0; i < 50; i++) {
            Circle circle = Circle.random(image.getWidth(), image.getHeight());
            circle.draw(image);
        }

        image.save("image.png");
    }
}