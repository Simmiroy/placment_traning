package Assignment;
import java.util.Scanner;
public class GradeSwitch {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter marks (0-100): ");
            int marks = sc.nextInt();
            char grade;

            if (marks >= 90) grade = 'A';
            else if (marks >= 75) grade = 'B';
            else if (marks >= 60) grade = 'C';
            else if (marks >= 50) grade = 'D';
            else grade = 'F';

            switch (grade) {
                case 'A': System.out.println("Excellent"); break;
                case 'B': System.out.println("Very Good"); break;
                case 'C': System.out.println("Good"); break;
                case 'D': System.out.println("Pass"); break;
                case 'F': System.out.println("Fail"); break;
            }
        }
}
