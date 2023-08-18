import java.util.Scanner;

public class conditions {
    public static void main(String[] args){
        //User enters a number
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number: ");
        int input = scan.nextInt();

        //system checks if number is positive or negative
        if(input >= 0){
            System.out.println("Number is positive");
        }
        if(input < 0){
            System.out.println("Number is negative");
        }

    }
}
