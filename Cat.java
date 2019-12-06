
//playing around with StringBuilder some more.

public class Cat{
private int age;
private String name;

//create a constructor

public Cat(int age, String name){
    this.age = age;
    this.name = name;
}
public String toString(){
    StringBuilder sb= new StringBuilder();
    sb.append(age).append(": ").append(name);
    return sb.toString();
}



public static void main(String[] args) {

    Cat catA= new Cat(3, "Debbie");
    Cat catB= new Cat(5, "Becky");

    System.out.println(catA.toString());
    System.out.println(catB.toString());
}
}