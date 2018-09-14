import java.util.Scanner;
import java.text.*;

class Calc{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat numform = new DecimalFormat("0.00");
        System.out.println('\n' + "Quiz Grade Calculator for Mr. Madeup's Math Class!" + '\n');

        //INITIALIZING VARIABLES

        int grade = 0, grades = 0, sum = 0, maxGrade = 0, minGrade = 100;
        double avg;
        String letterGrade;

        System.out.println("Enter quiz grades to average them (except highest and lowest score)" + '\n' + "Enter a value that is not between 0 and 100 (inclusive) to exit" + '\n');

        //WHILE LOOP WHICH TAKES IN GRADES

        while(true){
            System.out.println("What grade is quiz #" + (grades + 1));
            grade = scan.nextInt();
            if(grade >= 0 && grade <= 100){
                if(grade < minGrade){
                    minGrade = grade;
                }
                if(grade > maxGrade){
                    maxGrade = grade;
                }
                sum = sum + grade;
                grades++;
            } else break;
        }

        System.out.println("");

        //CALCULATING AVERAGE MINUS MAX AND MIN

        sum = sum - maxGrade - minGrade;
        avg = ((sum+0.0) / (grades-2));

        //LETTER GRADE CALC

        if(avg < 60){
            letterGrade = "F";
        } else if(avg >= 60 && avg < 70){
            letterGrade = "D";
        } else if(avg >= 70 && avg < 80){
            letterGrade = "C";
        } else if(avg >= 80 && avg < 90){
            letterGrade = "B";
        } else {
            letterGrade = "A";
        }

        //PROGRAM END OUTPUTS

        if(grades == 0){
            System.out.println("No grades entered!");
        } else if(grades <= 2) {
            System.out.println("Not enough scores to calculate an average (3 or more needed)");
        } else {
            System.out.println("Grades entered: " + grades);
            System.out.println("Max quiz grade: " + maxGrade);
            System.out.println("Min quiz grade: " + minGrade);
            System.out.println("Grade average: %" + numform.format(avg));
            System.out.println("Letter grade: " + letterGrade);
        }
    }
}