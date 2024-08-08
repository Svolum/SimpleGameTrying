package MyPack.ExternedOutput;

import java.io.IOException;

public class ClearingConsole {
    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }
    public static void stopHereFor(int milisec){
        try {
            Thread.sleep(milisec);
        }catch (InterruptedException e){
            System.out.println("InterruptedException");
        }
    }
}
