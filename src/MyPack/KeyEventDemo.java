package MyPack;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventDemo  implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.equals(KeyEvent.VK_J)){
            System.out.println("here");
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
