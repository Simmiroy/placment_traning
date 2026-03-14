package nestedclasses;

import java.time.LocalDate;

//local inner class.
public class Exam {
    void evaluate(int marks){
        class GradeCalculator{
            String calculate() {
                if (marks >= 75) return "Distinction";
                else if(marks>=60) return "First Class";
                else return "Pass";
            }

        }
        GradeCalculator gc= new GradeCalculator();
        System.out.println(gc.calculate());
    }
    void displayExamDate(){
        LocalDate date =LocalDate.now().minusDays(4);
        System.out.println("The exam date is : "+ date);
    }

    public static void main(String[] args) {
        Exam exam =new Exam();
        exam.evaluate(67);
        exam.evaluate(59);
        exam.evaluate(80);
        exam.displayExamDate();
    }
}
/*
Points to remember:
The great logic is scoped to the "evaluate" method.
It avoids the polluting the class with helper methods.
It helps in designing in codebase in a cleaner way.
*/