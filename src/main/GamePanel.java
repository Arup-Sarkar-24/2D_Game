package main;

import input.KeyboardInputs;
import input.MouseInputs;
import javax.swing.*;
import java.awt.*;


public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private Game game;


    public GamePanel(Game game){
        mouseInputs = new MouseInputs(this);
        this.game = game;

        setPanelSize();
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
        setFocusable(true);

        /*
        Timer timer = new Timer(16, e -> repaint()); // ~60 FPS
        timer.start();
         */
    }

    public void setPanelSize(){
        Dimension size = new Dimension(800,600);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }

    public void updateGame(){

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        game.render(g);
    }

    public Game getGame(){
        return game;
    }

}
