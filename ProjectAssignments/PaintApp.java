import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

public class PaintApp extends Frame implements MouseMotionListener, MouseListener, ActionListener {
    private int x, y, prevX, prevY;
    private Color currentColor = Color.BLACK;
    private BufferedImage canvas;
    private Graphics2D g2d;

    public PaintApp() {
        super("Paint Application");
        setSize(800, 600);
        setVisible(true);
        setResizable(false);
        addMouseMotionListener(this);
        addMouseListener(this);

        canvas = new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB);
        g2d = canvas.createGraphics();
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, 800, 600);
        g2d.setColor(currentColor);

        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Options");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem colorItem = new MenuItem("Change Color");
        saveItem.addActionListener(this);
        colorItem.addActionListener(this);
        menu.add(saveItem);
        menu.add(colorItem);
        menuBar.add(menu);
        setMenuBar(menuBar);
    }

    public void paint(Graphics g) {
        g.drawImage(canvas, 0, 0, this);
    }

    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        g2d.drawLine(prevX, prevY, x, y);
        repaint();
        prevX = x;
        prevY = y;
    }

    public void mousePressed(MouseEvent e) {
        prevX = e.getX();
        prevY = e.getY();
    }

    public void mouseReleased(MouseEvent e) {}

    public void mouseMoved(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Save")) {
            try {
                ImageIO.write(canvas, "PNG", new File("drawing.png"));
                JOptionPane.showMessageDialog(this, "Drawing saved as drawing.png");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (command.equals("Change Color")) {
            currentColor = JColorChooser.showDialog(this, "Choose a color", currentColor);
            if (currentColor != null) {
                g2d.setColor(currentColor);
            }
        }
    }

    public static void main(String[] args) {
        new PaintApp();
    }
}