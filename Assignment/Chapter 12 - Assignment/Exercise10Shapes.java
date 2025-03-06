
package chapter_12_assignment;
import java.awt.*;
import javax.swing.SwingUtilities;

    

abstract class Exercise10Shapes {
    protected Point start, end;
    protected Color color;

    public MyShape(Point start, Point end, Color color) {
        this.start = start;
        this.end = end;
        this.color = color;
    }

    public void setEndPoint(Point end) {
        this.end = end;
    }

    public abstract void draw(Graphics g);
}

class MyLine extends MyShape {
    public MyLine(Point start, Point end, Color color) {
        super(start, end, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawLine(start.x, start.y, end.x, end.y);
    }
}

class MyRectangle extends MyShape {
    public boolean filled;

    public MyRectangle(Point start, Point end, Color color, boolean filled) {
        super(start, end, color);
        this.filled = filled;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        int x = Math.min(start.x, end.x);
        int y = Math.min(start.y, end.y);
        int width = Math.abs(start.x - end.x);
        int height = Math.abs(start.y - end.y);
        if (filled) g.fillRect(x, y, width, height);
        else g.drawRect(x, y, width, height);
    }
}

class MyOval extends MyRectangle {
    public MyOval(Point start, Point end, Color color, boolean filled) {
        super(start, end, color, filled);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        int x = Math.min(start.x, end.x);
        int y = Math.min(start.y, end.y);
        int width = Math.abs(start.x - end.x);
        int height = Math.abs(start.y - end.y);
        if (filled) g.fillOval(x, y, width, height);
        else g.drawOval(x, y, width, height);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(DrawFrame::new);
    }
}


