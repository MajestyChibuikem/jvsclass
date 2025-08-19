package assignments;
/*
 * 
 * This program calculates the user's age based on their year of birth.
 * args: users year of birth
 * output: user's age
 */
public class agecalc {
    public static void main (String [] args){
        //get users birth year
        //calculate and output the user's age
        //year of birth
        int DOB = 2000;

        //to get users age: current year - dob
      

        int currentYear = 2025;


        int userAge = currentYear - DOB;
        System.out.println(userAge);
    }
    

}
