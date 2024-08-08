package MyPack.Ships;

import MyPack.Window.MainWindow;

public class Ship {
    private int x;
    private int y;
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public Ship(int x, int y){
        this.x = MainWindow.STANDART_STEP * (x / MainWindow.STANDART_STEP);
        this.y = MainWindow.STANDART_STEP * (y / MainWindow.STANDART_STEP);
    }
    public void moveX(int stepMult){
        setX(getX() + MainWindow.STANDART_STEP * stepMult);
    }
    public void moveY(int stepMult){
        setY(getY() + MainWindow.STANDART_STEP * stepMult);
    }
}
