public class Grades{
    public static void main(String[] args) {
        int testScore=76;
        char grade;//variable to store the grade

        if (testScore >=80){
            grade= 'A';
        }
            else if (testScore >=70){
                grade= 'B';
            }
                 else if (testScore >=50){
                    grade= 'B';
                 
                 }
                else{
                    grade= 'F';
                    
                }
                System.out.println("Grade "+ grade);
        }
       
    }
    
