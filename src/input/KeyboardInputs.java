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
            case KeyEvent.VK_W , KeyEvent.VK_T , KeyEvent.VK_I , KeyEvent.VK_8, KeyEvent.VK_UP -> gamePanel.setDirection(UP);

            //for down movement
            case KeyEvent.VK_X , KeyEvent.VK_B , KeyEvent.VK_M , KeyEvent.VK_2 , KeyEvent.VK_DOWN -> gamePanel.setDirection(DOWN);

            //for Left movement
            case KeyEvent.VK_A , KeyEvent.VK_F , KeyEvent.VK_J , KeyEvent.VK_4 , KeyEvent.VK_LEFT-> gamePanel.setDirection(LEFT);

            //for Right movement
            case KeyEvent.VK_D , KeyEvent.VK_H , KeyEvent.VK_L , KeyEvent.VK_6 , KeyEvent.VK_RIGHT-> gamePanel.setDirection(RIGHT);

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()){

            case KeyEvent.VK_W, KeyEvent.VK_T, KeyEvent.VK_I, KeyEvent.VK_8, KeyEvent.VK_UP,
                 KeyEvent.VK_X, KeyEvent.VK_B, KeyEvent.VK_M, KeyEvent.VK_2, KeyEvent.VK_DOWN,
                 KeyEvent.VK_A, KeyEvent.VK_F, KeyEvent.VK_J, KeyEvent.VK_4, KeyEvent.VK_LEFT,
                 KeyEvent.VK_D, KeyEvent.VK_H, KeyEvent.VK_L, KeyEvent.VK_6, KeyEvent.VK_RIGHT -> gamePanel.setMoving(false);

        }
    }
}
