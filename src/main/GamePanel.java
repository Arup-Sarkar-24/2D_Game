package main;

import input.KeyboardInputs;
import input.MouseInputs;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import static utilz.Constants.PlayerConstants.*;
import static utilz.Constants.Directions.*;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private float xDelta =100f, yDelta=100f;
    private BufferedImage img;
    private BufferedImage[][] animations;
    private int aniTick, aniIndex, aniSpeed = 15;
    private int playerAction = IDLE;
    private int playerDir = -1;
    private boolean moving = false;


    public GamePanel(){
        mouseInputs = new MouseInputs(this);
        
        importImg();
        loadAnimations();
        
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

    private void loadAnimations() {
        animations = new BufferedImage[9][6];

        for (int i = 0; i < animations.length; i++){
            for (int j = 0; j<animations[i].length;j++) {
                animations[i][j] = img.getSubimage(j*64,i*40,64,40);
            }
        }
    }

    private void importImg() {
        InputStream is = getClass().getResourceAsStream("/player_sprites.png");
        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setPanelSize(){
        Dimension size = new Dimension(800,600);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }

    public void setDirection(int direction){
        this.playerDir = direction;
        moving = true;
    }

    public void setMoving(boolean moving){
        this.moving = moving;
    }



    private void updateAnimationTick() {
        aniTick++;
        if (aniTick >= aniSpeed){
            aniTick = 0;
            aniIndex++;
            if (aniIndex >= GetSpriteAmount(playerAction))
                aniIndex=0;
        }

    }

    private void setAnimation() {
        if (moving)
            playerAction = RUNNING;
        else
            playerAction = IDLE;
    }

    public void updatePos(){
        if (moving){
            switch (playerDir){
                case LEFT -> xDelta += 5;
                case RIGHT -> xDelta -= 5;
                case UP -> yDelta -= 5;
                case DOWN -> yDelta += 5;
            }
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        updateAnimationTick();
        
        setAnimation();
        updatePos();
        
        g.drawImage(animations[playerAction][aniIndex],(int)xDelta,(int)yDelta,128,80,null);
    }
}
