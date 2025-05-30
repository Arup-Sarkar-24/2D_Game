package gamestates;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public interface Statemethods {

    void update();
    void test();
    void draw(Graphics g);
    void mouseClick(MouseEvent e);
    void mousePressed(MouseEvent e);
    void mouseReleased(MouseEvent e);
    void mouseMoved(MouseEvent e);
    void keyPressed(KeyEvent e);
    void keyReleased(KeyEvent e);
}
