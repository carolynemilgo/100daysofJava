class Person{
    int age;
    String name;

void sayNameAndAge(){
    System.out.println("My name is " + name + " and I am " + age + " years old");

}
public static void main(String[] args) {
    //create two new objects of class person

    Person personA= new Person();
    Person personB= new Person();

    //Assign names that will be output
    personA.name="Jane";
    personB.name="John";
    personA.age=30;
    personB.age=40;

    personA.sayNameAndAge();
    personB.sayNameAndAge();



}

}