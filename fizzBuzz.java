import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args){
        System.out.println("Enter the number:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number%5 == 0 && number%3 == 0){
            System.out.println("fizzbuzz");
        }
        else if (number%3 == 0){
            System.out.println("buzz");
        }
        else if(number%5 == 0){
            System.out.println("Fizz");
        }
        else{
            System.out.println(number);
        }

        scanner.close();
    }
}
