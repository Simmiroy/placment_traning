package exceptions;


import java.io.IOException;
/*import java.io.IOException; --->fully qualified classname.
*For Check Exception we always use try catch block.
*The throw keyword doesnt handle the exceptio.
*It will only oassses on the information to the calling method
*The calling mehtod has to handle the exception.
*The throw keyword is written int the method signature (name)*/
public class CheckedException {
    static void readFile()throws IOException{
        throw new IOException("File not found");
    }

    public static void main(String[] args) {
        try{
            display();
        }
        catch (IOException e){
            System.out.println(e.getMessage()); // this is for to get only the message not with the classname.
        }
    }
    static void display()throws IOException{
        readFile();
    }
}
