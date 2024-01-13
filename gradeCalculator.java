/*
 * A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
 */


import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        //create a scanner object for user input
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the student's score: ");
        int score = scan.nextInt();

        char grade = ' ';

        if(score >= 90 && score <= 100){
            grade = 'A';
        }
        else if(score >= 80 && score <= 89){
            grade = 'B';
        }
        else if (score >= 70 && score <= 79){
            grade = 'C';
        }
        else if (score >= 60 && score <= 69){
            grade = 'D';
        }
        else if(score >= 0 && score <= 59){
            grade = 'F';
        }
        else{
            System.out.println("Please enter valid number between 0 and 100.");
            scan.close();
                return;
                
        }
        System.out.println("The student's grade is " + grade +".");
        scan.close();
    }
}
