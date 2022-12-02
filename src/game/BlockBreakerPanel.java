package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JPanel;

public class BlockBreakerPanel extends JPanel implements KeyListener {
    ArrayList<Block> blocks = new ArrayList<Block>();
Block paddle;
Thread thread;
Animated animated;
    BlockBreakerPanel() {
        paddle = new Block(175,480,150,25,"paddle.png");
        for (int i = 0; i < 8; i++) {
            blocks.add(new Block((i * 60 + 2), 0, 60, 25, "violet.png"));
        }
        for (int i = 0; i < 8; i++) {
            blocks.add(new Block((i * 60 + 2), 25, 60, 25, "red.png"));
        }
        for (int i = 0; i < 8; i++) {
            blocks.add(new Block((i * 60 + 2), 50, 60, 25, "green.png"));
        }
        for (int i = 0; i < 8; i++) {
            blocks.add(new Block((i * 60 + 2), 75, 60, 25, "yellow.png"));
        }
        addKeyListener(this);
        setFocusable(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Block b : blocks){
            b.draw(g,this);
            paddle.draw(g,this);
        }
    }
    public void update() {
        repaint();
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
       animated = new Animated(this);
       thread = new Thread(animated);
       thread.start();
       }
     if(e.getKeyCode() == KeyEvent.VK_LEFT && paddle.x>0){
      paddle.x-=15;
     }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT && paddle.x<(getWidth()-paddle.width)){
            paddle.x+=15;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
