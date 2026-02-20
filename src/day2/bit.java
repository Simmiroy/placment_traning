package day2;
import java.util.Scanner;

public class bit {
    public static int no_bits(int n) {
        int count = 0;
        while (n != 0) {
            if (((n & 1) == 1)) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int result=no_bits(10);
        System.out.println(result);
    }
}
