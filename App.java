//practicing constructors
class Machine{
private int age;
 private String name;
public Machine(){

    system.out.println("First constructor running");
}
public Machine(String name, int age){
    system.out.println("Second constructor running");
    this.name=name;
    this.age=age;

}
}
public class App{
    public static void main(String[] args) {
        Machine machine1= new Machine();

       //System.out.println(machine1.Machine());

       // Machine machine2= new Machine("Milgo", 20);

        //System.out.println(machine2.Machine());

        
    }
}