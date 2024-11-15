import java.applet.Applet;
import java.awt.Graphics;

public class ShapesDraw extends Applet {

    @Override
    public void paint(Graphics g) {
        // Draw a circle
        g.drawOval(50, 50, 100, 100); // x, y, width, height

        // Draw a rectangle
        g.drawRect(200, 50, 150, 100); // x, y, width, height

        // Draw a line
        g.drawLine(50, 200, 300, 200); // x1, y1, x2, y2
    }
}