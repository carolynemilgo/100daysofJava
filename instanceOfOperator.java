public class instanceOfOperator{


    //Defines a program where a child inherits from the Parent class and implements the interface. 
    public static void main(String[] args) {
       Parent  object1= new Parent();//declare instance of class Parent
       Parent object2= new Child();

//This will print boolean values
       System.out.println("Object1 instance of Parent" + (object1 instanceof Parent));
       System.out.println("Object2 instance of Child" + (object2 instanceof Child));
       System.out.println("Object2 instance of Parent" + (object2 instanceof Parent));
       System.out.println("Object2 instance of myInterface" + (object2 instanceof myInterface));
       System.out.println("Object1 instance of myInterface" + (object1 instanceof myInterface));

    }
}

class Parent {}

interface myInterface{}

class Child extends Parent implements myInterface{}