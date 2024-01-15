import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to display it's multiplication table: ");

        int num = scan.nextInt();

        if(num>0){
        for(int i=1; i<=10; i++){
            int result = num * i;
            System.out.println(num + "x" + i + "=" + result);
        }
    }
    else{
        System.out.println("enter positive number");
    }
        scan.close();
    }
}
