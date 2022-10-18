package answerkey13;

public class four {
    public static void main(String[] args) {
        int year = 1600;
        
        
        boolean userLeapYear = false;
        
        if ((year % 4) == 0){
            userLeapYear = true;
            
            if ((year % 100) == 0){
                userLeapYear = false;
            }
                if ((year) % 400 == 0)
                    userLeapYear = true;
        }

        if (userLeapYear == true) { //checking if number is even or odd
            System.out.println(year + " is leap year :)");
        }
        else{
            System.out.println(year + " is not leap year :(");
        }
    }
}
