package MyPack.Ships;

import MyPack.Window.MainWindow;

import java.awt.*;

public class Player extends Ship{
    public Player(){
        // и там он сам внутри себя все как-то сделает
        // т.е. установит X и Y
        super(  MainWindow.WINDOW_WIDTH / 2     - MainWindow.STANDART_LENGHT / 2,
                MainWindow.WINDOW_HEIGHT / 2    - MainWindow.STANDART_LENGHT / 2);
    }
}
