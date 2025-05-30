package gamestates;

import entities.Player;
import levels.LevelManager;
import main.Game;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Playing extends State implements Statemethods {

    private Player player;
    private LevelManager levelManager;

    public Playing(Game game){
        super(game);
        initClasses();
    }

    public void initClasses(){
        levelManager = new LevelManager(game);
        player = new Player(200,200,(int) (64*Game.SCALE),(int) (40*Game.SCALE));
        player.loadLvlData(levelManager.getCurrentLevel().getLevelData());
    }

    public void windowFocusLost(){
        player.resetDirBooleans();
    }

    public Player getPlayer(){
        return player;
    }

    @Override
    public void update() {
        levelManager.update();
        player.update();
    }

    @Override
    public void test() {

    }

    @Override
    public void draw(Graphics g) {
        levelManager.draw(g);
        player.render(g);
    }

    @Override
    public void mouseClick(MouseEvent e) {

        if (e.getButton() == MouseEvent.BUTTON1)
            player.setAttacking(true);

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_A, KeyEvent.VK_F, KeyEvent.VK_J, KeyEvent.VK_4, KeyEvent.VK_LEFT ->
                    player.setLeft(true);
            case KeyEvent.VK_D, KeyEvent.VK_H, KeyEvent.VK_L, KeyEvent.VK_6, KeyEvent.VK_RIGHT ->
                    player.setRight(true);
            case KeyEvent.VK_SPACE -> player.setJump(true);
            case KeyEvent.VK_BACK_SPACE -> GameState.state = GameState.MENU;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        switch (e.getKeyCode()) {
            case KeyEvent.VK_A, KeyEvent.VK_F, KeyEvent.VK_J, KeyEvent.VK_4, KeyEvent.VK_LEFT ->
                    player.setLeft(false);
            case KeyEvent.VK_D, KeyEvent.VK_H, KeyEvent.VK_L, KeyEvent.VK_6, KeyEvent.VK_RIGHT ->
                    player.setRight(false);
            case KeyEvent.VK_SPACE -> player.setJump(false);
        }
    }
}
