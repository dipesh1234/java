import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){
        int age = 30;
        // long viewsCount = 1_234_567_890L;
        // float price = 10.23F;
        // char letter = 'A';
        // boolean isEligible = true;

        System.out.println(age);

        LocalDateTime showDateTime = LocalDateTime.now();
        System.out.println(showDateTime);


    }
}

class primitiveTypes{
    public static void main(String[] args){
       byte x=1;
       byte y=x;
       x=2;
       System.out.println(y);
    }
}