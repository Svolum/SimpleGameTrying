package MyPack.Window;

import MyPack.Ships.Admin;
import MyPack.Ships.Player;
import MyPack.Ships.Ship;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class MainWindow extends JFrame {
    private Admin admin;
    public static final int STANDART_LENGHT = 20;
    public static final int STANDART_STEP = 10;
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 450;

    ////////////////////////////////////////////////
    public MainWindow(){
        super("Main window");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
//        setBackground(Color.RED);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // INITIALIZE
        initAll();
        this.addKeyListener(new MyKeyListener());


        setVisible(true);
        loop();
    }
    public void loop(){
//        this.update(getGraphics());
        this.paintAll(getGraphics());
//        this.removeAll();
//        this.repaint();
        paint(getGraphics());


//        admin.moveEnemies();


        try{
            Thread.sleep(50);
        } catch (Exception e){

        }
        loop();
    }
    private void initAll(){
        admin = new Admin();
    }
    public void paint(Graphics g){
        for (Ship ship: admin.getShipsPool()){
            g.drawRect(ship.getX(), ship.getY(), STANDART_LENGHT, STANDART_LENGHT);
        }
    }
    public class MyKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()){
                case KeyEvent.VK_W:
                    admin.getPlayer().moveY(-1);
                    break;
                case KeyEvent.VK_S:
                    admin.getPlayer().moveY(1);
                    break;
                case KeyEvent.VK_A:
                    admin.getPlayer().moveX(-1);
                    break;
                case KeyEvent.VK_D:
                    admin.getPlayer().moveX(1);
                    break;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}