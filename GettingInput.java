import java.util.Scanner;

//import the input scanner


public class GettingInput{
    public static void main(String[] args) {
//create scanner oject
        Scanner userInput= new Scanner(System.in);
//prompt user to input something-display some message/instructions
        System.out.println("Enter a line of text");
//wait for user to enter line of text
        String line= userInput.nextLine();
//tell the user what they entered
        System.out.println( "You entered " + line);
    }
}