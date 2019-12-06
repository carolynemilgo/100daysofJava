public class Numbers{
//declare instance variables

public int age;
public String name;

//create methods
public void showName(){

    System.out.println(name);
}
public void showAge(){

    System.out.println(age);
}

}

public class StaticVariablesMethoda{
    public static void main(String[] args) {

        Numbers number1 = new Numbers();
        number1.name="Carol";
        number1.age=30;

        System.out.println(number1.showAge);
        System.out.println(number1.showName);
    }
}