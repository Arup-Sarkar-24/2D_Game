package main;

import input.KeyboardInputs;
import input.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private float xDelta =100f, yDelta=100f;
    private float xDir =0.5f, yDir =0.5f;
    private Color color = new Color(150,20,90);
    private Random random;

    public GamePanel(){

        random = new Random();
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
        setFocusable(true);

        Timer timer = new Timer(16, e -> repaint()); // ~60 FPS
        timer.start();
    }

    public void changleXDelta(int value){
        this.xDelta +=value;
    }

    public void changleYDelta(int value){
        this.yDelta +=value;
    }

    public void setRectPos(int x, int y){
        this.xDelta = x;
        this.yDelta = y;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        updateRectangle();
        g.setColor(color);
        g.fillRect((int) xDelta,(int) yDelta,200,50);




    }

    private void updateRectangle() {
        xDelta+= xDir;
        if (xDelta <= 0 || xDelta + 200 >= 400){
            xDir *= -1;
            color = getRandColor();
        }

        yDelta+= yDir;
        if (yDelta <= 0 || yDelta + 50 >= 400){
            yDir *= -1;
            color = getRandColor();
        }
    }

    private Color getRandColor() {
        int r = random.nextInt(256); // 0–255 inclusive
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new Color(r, g, b);
    }

}
