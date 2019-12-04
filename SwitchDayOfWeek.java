public class SwitchDayOfWeek{

public static void main(String[] args) {

    //int day=9; //returns the default statement since we do not have a 9th day-a case to represent this
    int day=5;//returns the day based on cases
    String dayString;
    //begining of switch statement and the cases applicable
    switch (day){
        case 1: dayString = "Monday";
        break;
        case 2: dayString = "Tuesday";
        break;
        case 3: dayString = "Wednesday";
        break;
        case 4: dayString = "Thursday";
        break;
        case 5: dayString = "Friday";
        break;
        case 6: dayString = "Saturday";
        break;
        case 7: dayString = "Sunday";
        break;
        default: dayString= "Day does not exist";
        break;
    }

    System.out.println(dayString);
}

}