public class controlFlow {
    public static void main(String[] args){
        String role = "abc";

        switch(role){
            case "admin":
                System.out.println("you're admin");
                break;

            case "moderator":
                System.out.println("you're a moderator");
                break;

            default:
                System.out.println("you're a guest");
        }
    }
}
