package geometrical_shapes;
import java.awt.*;
import java.util.Random;

interface Drawable {
    void draw(Displayable displayable);
    Color getColor();

    default void drawLine(Point p0,Point p1,Displayable disp, Color color) {
        int x0 = p0.getX() ;
        int y0 = p0.getY() ;
        int x1 = p1.getX() ;
        int y1 = p1.getY() ;

        int dx = x1 - x0;
        int dy = y1 - y0;
        int step = Math.max(Math.abs(dx) , Math.abs(dy));

        float x_incr = dx/ (float) step;
        float y_incr = dy/(float) step;

        float x = x0;
        float y = y0;
        for (int i = 0 ; i <= step; i++) {
            disp.display(Math.round(x), Math.round(y), color);
            x += x_incr;
            y += y_incr;
         }
    }

    default Color getRandomColor() {
        Random r = new Random();
        int red = 50 + r.nextInt(206);
        int green = 50 + r.nextInt(206);
        int blue = 50 + r.nextInt(206);
        return new Color(red, green, blue);
    }
}