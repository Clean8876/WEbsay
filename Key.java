import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Hello extends Applet implements KeyListener {

  String message = ""; // to store message when Key pressed

  public void init() {
    addKeyListener(this);
  }

  // When a key is pressed it will display key charrecter
  public void keyPressed(KeyEvent e) {
    int keyCode = e.getKeyCode();

    if (keyCode == KeyEvent.VK_LEFT) {
      message = "Left arrow key pressed";
    } else if (keyCode == KeyEvent.VK_RIGHT) {
      message = "Right arrow key pressed";
    } else {
      char c = e.getKeyChar();here we used Char instead because it show single value not mupltiple
      message = "Key pressed: " + c;
    }

    repaint(); // refresh display or it will show same value
  }

  // When a key is released it
  public void keyReleased(KeyEvent e) {
    message = "sad key released :( ";

    repaint(); // refresh display
  }

  // Draw the applet
  public void paint(Graphics g) {
    g.drawString(message, 10, 100); // show message

    // HTML to display applet
    g.drawString("<applet code=\"KeyEventApplet.class\" width=\"300\" height=\"300\"></applet>", 10, 20);
  }

}