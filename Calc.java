import java.util.Scanner;
import java.text.*;

class Calc{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat numform = new DecimalFormat("0.00");
        System.out.println('\n' + "Quiz Grade Calculator for Mr. Madeup's Math Class!" + '\n');

        int grade = 0, grades = 0, sum = 0, maxGrade = 0, minGrade = 100;
        double avg;

        System.out.println("Enter quiz grades to average them (except highest and lowest score)" + '\n' + "Type a value that is not between 0 and 100 to exit" + '\n');

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

        sum = sum - maxGrade - minGrade;
        avg = ((sum+0.0) / (grades-2));

        if(grades == 0){
            System.out.println("No grades entered!");
        } else if(grades <= 2) {
            System.out.println("Not enough scores to calculate an average (3 or more needed)");
        } else {
            System.out.println("grades entered: " + grades);
            System.out.println("max: " + maxGrade);
            System.out.println("min: " + minGrade);
            System.out.println("Grade average: %" + numform.format(avg));
        }
    }
}