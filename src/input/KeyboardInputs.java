package input;

import main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static utilz.Constants.Directions.*;

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
            case KeyEvent.VK_W-> gamePanel.setDirection(UP);
            case KeyEvent.VK_UP-> gamePanel.setDirection(UP);

            //for down movement
            case KeyEvent.VK_X-> gamePanel.setDirection(DOWN);
            case KeyEvent.VK_DOWN -> gamePanel.setDirection(DOWN);

            //for right movement
            case KeyEvent.VK_A-> gamePanel.setDirection(RIGHT);
            case KeyEvent.VK_LEFT-> gamePanel.setDirection(RIGHT);

            //for left movement
            case KeyEvent.VK_D-> gamePanel.setDirection(LEFT);
            case KeyEvent.VK_RIGHT-> gamePanel.setDirection(LEFT);

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()){

            case KeyEvent.VK_W :
            case KeyEvent.VK_UP :
            case KeyEvent.VK_X :
            case KeyEvent.VK_DOWN :
            case KeyEvent.VK_A :
            case KeyEvent.VK_LEFT :
            case KeyEvent.VK_D :
            case KeyEvent.VK_RIGHT :
                gamePanel.setMoving(false);
                break;
        }
    }
}
