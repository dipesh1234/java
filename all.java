import java.util.Scanner;

public class all {
    public static void main(String[] args){
        System.out.print("Name: ");
        Scanner scanner = new Scanner(System.in);
        
        String name = scanner.nextLine().trim();
        System.out.println("you are "+ name+ ".");
}
}
