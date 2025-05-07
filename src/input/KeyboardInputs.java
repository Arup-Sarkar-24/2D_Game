package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_W-> System.out.println("It's W");
            case KeyEvent.VK_A-> System.out.println("It's A");
            case KeyEvent.VK_S-> System.out.println("It's S");
            case KeyEvent.VK_D-> System.out.println("It's D");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
