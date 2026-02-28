package nestedclasses;
//Static nested class.
public class University {
    static class Admission{
        static boolean isEligible(int marks){
            return marks>=60;
        }
    }

    public static void main(String[] args) {
        boolean result1 =University.Admission.isEligible(50);
        System.out.println(result1);
        boolean result2 = University.Admission.isEligible(95);
        System.out.println(result2);

    }
}
/*
Points to remember:

No University object needed- no heap memory needed.
Logical grouping of data - improves reliability.
Similar to creating utility -helper class...
*/