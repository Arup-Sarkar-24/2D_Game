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
            case KeyEvent.VK_W, KeyEvent.VK_T, KeyEvent.VK_I, KeyEvent.VK_8, KeyEvent.VK_UP -> gamePanel.getGame().getPlayer().setUp(true);
            case KeyEvent.VK_X, KeyEvent.VK_B, KeyEvent.VK_M, KeyEvent.VK_2, KeyEvent.VK_DOWN -> gamePanel.getGame().getPlayer().setDown(true);
            case KeyEvent.VK_A, KeyEvent.VK_F, KeyEvent.VK_J, KeyEvent.VK_4, KeyEvent.VK_LEFT -> gamePanel.getGame().getPlayer().setLeft(true);
            case KeyEvent.VK_D, KeyEvent.VK_H, KeyEvent.VK_L, KeyEvent.VK_6, KeyEvent.VK_RIGHT -> gamePanel.getGame().getPlayer().setRight(true);
            case KeyEvent.VK_SPACE-> gamePanel.getGame().getPlayer().setJump(true);

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_W, KeyEvent.VK_T, KeyEvent.VK_I, KeyEvent.VK_8, KeyEvent.VK_UP -> gamePanel.getGame().getPlayer().setUp(false);
            case KeyEvent.VK_X, KeyEvent.VK_B, KeyEvent.VK_M, KeyEvent.VK_2, KeyEvent.VK_DOWN -> gamePanel.getGame().getPlayer().setDown(false);
            case KeyEvent.VK_A, KeyEvent.VK_F, KeyEvent.VK_J, KeyEvent.VK_4, KeyEvent.VK_LEFT -> gamePanel.getGame().getPlayer().setLeft(false);
            case KeyEvent.VK_D, KeyEvent.VK_H, KeyEvent.VK_L, KeyEvent.VK_6, KeyEvent.VK_RIGHT -> gamePanel.getGame().getPlayer().setRight(false);
            case KeyEvent.VK_SPACE-> gamePanel.getGame().getPlayer().setJump(false);

        }
    }
}
