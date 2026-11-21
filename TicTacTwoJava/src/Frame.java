import javax.swing.*;
import java.awt.event.*;

// Implementation of arrow key detection
public class KeyEvents extends JFrame {
    public KeyEvents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding KeyListener to the JFrame
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                    case KeyEvent.VK_W:
                        System.out.println("Up Arrow Pressed");
                        break;
                    case KeyEvent.VK_DOWN:
                    case KeyEvent.VK_S:
                        System.out.println("Down Arrow Pressed");
                        break;
                    case KeyEvent.VK_LEFT:
                    case KeyEvent.VK_A:
                        System.out.println("Left Arrow Pressed");
                        break;
                    case KeyEvent.VK_RIGHT:
                    case KeyEvent.VK_D:
                        System.out.println("Right Arrow Pressed");
                        break;
                    case KeyEvent.VK_SPACE:
                        System.out.println("Pressed Space");
                        break;
                }
            }
        });
        setVisible(true);
    }
}