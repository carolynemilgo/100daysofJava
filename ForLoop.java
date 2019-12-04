public class ForLoop{

    public static void main(String[] args) {
        
        for (int i=0; i <= 5; i++)
        {

            System.out.println("hello " + i);


            /*Alternatively we can use printf, this however refers to a format specifier which is a string that can contains special symbols
            that will be replaced by the number or variable that you will have. For example, the format specifier begins with %d()represents
            a number and this will be replaced by the number just after the string i.e %d is replaced by i

            System.out.printf("Hello: %d", i);

            This will be printed in one line. If you need to separate into next lines for each output, try this
            1.  System.out.printf("Hello: %d\n", i); or 

            
            2.   System.out.printf("Hello: %d", i);
                System.out.println()
            
            */
        }
        
    }
}
