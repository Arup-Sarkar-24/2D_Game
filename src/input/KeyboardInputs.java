package input;

import main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {

    private GamePanel gamePanel;
    public  KeyboardInputs(GamePanel gamePanel){
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            //for up movement
            case KeyEvent.VK_W-> gamePanel.changleYDelta(-5);
            case KeyEvent.VK_UP-> gamePanel.changleYDelta(-5);

            //for down movement
            case KeyEvent.VK_X-> gamePanel.changleYDelta(5);
            case KeyEvent.VK_DOWN -> gamePanel.changleYDelta(5);

            //for right movement
            case KeyEvent.VK_A-> gamePanel.changleXDelta(-5);
            case KeyEvent.VK_LEFT-> gamePanel.changleXDelta(-5);

            //for left movement
            case KeyEvent.VK_D-> gamePanel.changleXDelta(5);
            case KeyEvent.VK_RIGHT-> gamePanel.changleXDelta(5);

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
