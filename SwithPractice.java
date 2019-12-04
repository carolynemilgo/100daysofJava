import java.util.Scanner;

public class SwithPractice {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter start or stop");
        String text= input.nextLine();

        switch (text){
            case "start":
            System.out.println("Machine has started");
            break;
            case "stop" :
            System.out.println("Machine has stopped");
            break;


            default:
            System.out.println("What are those you have input?");
        }
        

    }
}