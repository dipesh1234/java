import java.util.Scanner;

public class conditions {
    public static void main(String[] args){
        //User enters a number
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = scan.nextDouble();

        System.out.print("Input b: ");
        double b = scan.nextDouble();

        System.out.print("Input c: ");
        double c = scan.nextDouble();

        //solving quadratic equation
        double result = b*b - 4*a*c;

        if(result > 0){
            double r1 = (-b + Math.pow(result, 0.5)) / (2*a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2*a);
            System.out.println("The roots are " + r1 +" "+ "and"+ " " +r2);
        }
        else if(result == 0){
            double r1 = (-b) / (2*a);
            System.out.println("the root is " + " " + r1); 
        }
        else{
            System.out.println("the equations has no real roots");
        }

        scan.close();
    }
    
}
