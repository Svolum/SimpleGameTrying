package MyPack.Ships;

import java.util.ArrayList;

public class Admin {
    private ArrayList<Ship> shipsPool;
    private Player player;

    public ArrayList<Ship> getShipsPool() {
        return shipsPool;
    }
    public Player getPlayer() {
        return player;
    }

    public Admin(){
        shipsPool = new ArrayList<>();

        createShips();
    }
    private void createShips(){
        player = new Player();
        shipsPool.add(player);

        shipsPool.add(new Enemy(200, 200));
        shipsPool.add(new Enemy(230, 220));
        shipsPool.add(new Enemy(260, 204));
        shipsPool.add(new Enemy(290, 190));
        shipsPool.add(new Enemy(320, 180));
        shipsPool.add(new Enemy(355, 170));
    }
    public void moveEnemies(){
        for (Ship ship : shipsPool){
            if (ship instanceof Enemy){
                ////////////////////////////////////////////////////////////////
                int x = player.getX() - ship.getX();
                int y = player.getY() - ship.getY();
                if (x > 0){
                    ship.moveX(1);
                }else if(x < 0){
                    ship.moveX(-1);
                }
                if (y > 0){
                    ship.moveY(1);
                }else if(y < 0){
                    ship.moveY(-1);
                }
                ////////////////////////////////////////////////////////////////
            }
        }
    }
}
