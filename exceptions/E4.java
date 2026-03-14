package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*Throws keyword do tucking means just passing onn information.
BufferedReader can read the keywords as well meaning it will give output for the empty string also.
*/
public class E4 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = null;
        String str;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter any data");
            str = br.readLine();
            System.out.println(str);
//        }catch (Exception e){
//            br.close();
//        }
        }
    }
}
/*We can write the try block without catch or finally block by using try with resource.
* br.close is not needed because it is closed automatically  by AutoClosable class.*/
