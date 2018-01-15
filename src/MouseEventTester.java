
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Mouse events: MouseListener
// (1) click, (2) entered, (3) exited, (4) pressed, (5) released
public class MouseEventTester extends JFrame {

    private JPanel canvas;

    public void initialize() {
        canvas = new JPanel();
        canvas.setBackground(Color.black);
        canvas.addMouseListener(new MouseEventObserver());
        Container cp = getContentPane();
        cp.add(canvas, BorderLayout.CENTER);
    }

    class MouseEventObserver implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse clicked. x = " + e.getX() + " y = " + e.getY());
        }

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("Mouse pressed. x = " + e.getX() + " y = " + e.getY());
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("Mouse released. x = " + e.getX() + " y = " + e.getY());
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("Mouse entered. x = " + e.getX() + " y = " + e.getY());
        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("Mouse exited. x = " + e.getX() + " y = " + e.getY());
        }
    }
}
