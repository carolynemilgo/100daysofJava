public class PlayStrings{
    public static void main(String[] args) {
        String info= "";

       
       //Some piece of innefficient code
       info += "My name is Bob";

        info += ". ";

        info += "Call me Bob, Bob the builder";

        System.out.println(info);

        //More efficient code
        //instead of using the above code that can make the program slow and it eats
        //up too much memory, use Stringbuilder 

        StringBuilder sb = new StringBuilder("");//you don't need to supply an initial value for it but you can if you want
        //This String builder is going to be initialized with this string ""

    
       // Using append(definitely more efficient) we can modify the contents of the string builder such that::

       sb.append("My name is Carolyne");
       sb.append(". ");
       sb.append("I love Java");


       //when outputing- combine the bits of strings so to speak into one string
       System.out.println(sb.toString());

       //Basically Stringbuilder gives you a more efficient memory way of appending text

       //Another way of doing the same thing as above
       StringBuilder s = new StringBuilder();
       s.append("My name is Bobby")  //no semicolon
       .append(" . ")
       .append("I am a German Shepherd"); //ideally should be one line

       //print the combined string

       System.out.println(s.toString());


       //formatting strings
       System.out.println("Carolyne \t This will create a tab \n And then I will get a new line output" );
       System.out.print("Carolyne \t This will create a tab \n And then I will get a new line output" );
       System.out.println("Yeeey");//if this follow Print then  it will print in one line

       //There is also printf

       System.out.printf("My name is Carol and I have %2d:litres of milk.", 5);


       for (int i=0; i < 12;  i++){

           System.out.printf("There were %2d ducks and the little one said roll over. \n", i);
       }

       //formatting floating point numbers


       System.out.printf("PI is equal to %3.2f \n", 3.1459);
       System.out.printf("PI is equal to %5f" , 3.1459);

    }
}