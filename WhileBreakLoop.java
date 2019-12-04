public class WhileBreakLoop{
    public static void main(String[] args) {
        //there is no loop that really exists called while break loop, just playing around with the while loop
        //Add the break statement to avoid infinite loops


        int loop=0;
        while(true){

            System.out.println("Looping " + loop);

            if(loop ==3 ){
                break;
            }
            loop++;
            System.out.println ("Running");
        }
        
    }
}