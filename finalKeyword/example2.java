package finalKeyword;

public class example2 {
    //If we dont initialize the final variable then can do it in the constructor.
     final int x;

    //
    example2(){       //Constructor.
        x=200;
    }
    static final int y;

    public static void main(String[] args) {      //we cannot run the program without the main method.
        //Object is mandatory for IIE output.
    }
    static {
        y=10;
        System.out.println("Start");
        System.out.println("DB - Start");
        System.out.println("Internet - Start");
        System.out.println("Load Files");
    }
}