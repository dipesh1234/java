import java.util.Scanner;

public class shapeType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of sides(3-8): ");
        int numberOfSides = scan.nextInt();

        switch (numberOfSides) {
            case 3:
                System.out.println("The shape is triangle");
                break;

            case 4:
                System.out.println("The shape is Quadrilateral");
                break;

            case 5:
                System.out.println("The shape is Pentagon");
                break;

            case 6:
                System.out.println("The shape is Hexagon");
                break;

            case 7:
                System.out.println("The shape is Heptagon");
                break;

            case 8:
                System.out.println("The shape is Octagon");
                break;
        
            default:
                System.out.println("Error: Enter the valid number for sides.");
                break;
        }
        scan.close();



    }
}
