package MyPack.ExternedOutput;

import java.io.IOException;

public class Lol {
    public Lol(){
        loop(0);
        /*try {
            someExampleOfEntering();
        }catch (Exception e){

        }*/
    }
    private void loop(int cycleNumber){
        ClearingConsole.cls();


        System.out.println("cycleNumber = " + cycleNumber);
        try {
            int code = System.in.read();
            char ch = (char) code;
            System.out.println("ch = " + ch);
        }catch (Exception e){

        }


        ClearingConsole.stopHereFor(500);
        loop(cycleNumber + 1);
    }
    public void someExampleOfEntering() throws IOException {
        ClearingConsole.cls();
        char ch ;
        int code ;
        while ( -1 != (code = System.in.read ()) )
        {
            ch = (char) code ;
            System.out.println ( "you pressed: '" + ch + "'\n" ) ;

            // выйти когда нажато 'q'
            if ( 'q' == ch )
            {
                System.exit ( 0 ) ;
            }
        }
    }
}
