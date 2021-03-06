/* Age Year Calculator */

import java.util.Scanner;

public class Age_Year_Calculator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int year;

        /* Prompt */
        System.out.println("Hello, welcome to the age-year calculator!");
        System.out.println("To start, enter the year you were born (YYYY)\n");

        year = scan.nextInt();

        /* Calculations and Statements */
        if (year >= 0 && year <= 2020)
        {
            int age = (2020 - year);
            System.out.println("\nIf you were born in the year " + year +  ",\nyou are now " + age + " years old");

        }

        else {
            System.out.println("\nError! - The year number must be between 0 to 2020");
            System.out.println("\nPlease retry by inputting a number between 0 to 2020");
        }

    }
}
  
