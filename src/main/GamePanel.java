package main;

import input.KeyboardInputs;
import input.MouseInputs;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private int xDelta =100, yDelta=100;
    public GamePanel(){

        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void changleXDelta(int value){
        this.xDelta +=value;
        repaint();
    }

    public void changleYDelta(int value){
        this.yDelta +=value;
        repaint();
    }

    public void setRectPos(int x, int y){
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(xDelta,yDelta,200,50);
    }
}
