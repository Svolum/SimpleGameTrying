package MyPack.ExternedOutput;

public class SimpleColoredOutput {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static void output(){
        System.out.println( ANSI_RED + "Цв" + ANSI_GREEN + "ет" + ANSI_YELLOW + "но" + ANSI_BLUE +
                            "й т" + ANSI_PURPLE + "ек" + ANSI_CYAN + "ст" + ANSI_WHITE + "!!" + ANSI_RESET);
        coloderOutput();
        System.out.println();
        coloredBackground();
    }
    public static void coloderOutput(){
        // более наглядный вывод
        for(int i = 0; i < 8; i++){
            for (int der : new int[]{3, 9}){
                String defaultNumber = "\u001B[" + String.valueOf(der);
                String someColor = defaultNumber + String.valueOf(i) + "m";;

                System.out.print(someColor + "text" + ANSI_RESET);
                System.out.print("\t");
            }
            System.out.println();
        }

        /*for (int der : new int[]{3, 9}){
            //        String defaultNumber = "\u001B[";
            String defaultNumber = "\u001B[" + String.valueOf(der);
            String text = "text";

            for(int i = 0; i < 8; i++){
                String someColor =defaultNumber + String.valueOf(i) + "m";;
                System.out.println(someColor + text + ANSI_RESET);
            }
            // В итоге получается что-то вроде этого
            // "\u001B[30m" - обычный
            // "\u001B[91m" - яркий
            System.out.println();
        }*/
    }
    public static void coloredBackground(){
        // более наглядный вывод
        for(int i = 0; i < 8; i++){
            for (int der : new int[]{4, 10}){
                String defaultNumber = "\u001B[" + String.valueOf(der);
                String someColor = defaultNumber + String.valueOf(i) + "m";;

                System.out.print(someColor + "text" + ANSI_RESET);
                System.out.print("\t");
            }
            System.out.println();
        }

        /*for (int der : new int[]{4, 10}){
            //        String defaultNumber = "\u001B[";
            String defaultNumber = "\u001B[" + String.valueOf(der);
            String text = "text";

            for(int i = 0; i < 8; i++){
                String someColor =defaultNumber + String.valueOf(i) + "m";;
                System.out.println(someColor + text + ANSI_RESET);
            }
            // В итоге получается что-то вроде этого
            // "\u001B[40m" - обычный
            // "\u001B[101m" - яркий
            System.out.println();
        }*/
    }
    public static void formattedOutput(){
        int a = 9;
        int b = 10 / 3;
        float c = (float) 10 / 3;
        System.out.printf("formatted output:\na=%d, b=%d, c=%.2f\n", a, b, c);
    }
}
