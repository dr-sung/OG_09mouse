
import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        MouseEventTester mouseEventWindow = new MouseEventTester();
        
        mouseEventWindow.setTitle("Mouse Events");
        mouseEventWindow.setSize(500, 300);
        mouseEventWindow.setLocation(100, 100);
        mouseEventWindow.initialize();
        
        mouseEventWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseEventWindow.setVisible(true);
    }
}
