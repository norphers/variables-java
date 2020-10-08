import java.util.*;

public class exerciciVariables 
{
	public static void main(String[] args) 
	{	
		// Exercise 1.1
		
        String firstName="Oriol";
        String lastName1="Canadés";
        String lastName2="Díez";
        int day=26;
        int month=2;
        int year=2020;
        System.out.print(lastName1 + " " + lastName2 + ", " + firstName + "\n");
        System.out.print(day + "/" + month + "/" + year);

        // Exercise 1.2
        
        final int constantLeapYear=1948;

        int [] arrayLeapYears = new int[1000];
        
        for (int i=4; i<2024; i+=4)
        {
            if (i%400==0 || i%4==0 || i/100!=0) {
                System.out.println(i);
            }
        }
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entry your birth year: ");

        int birthYear=sc.nextInt();
        
        int resultLYCount=(birthYear-constantLeapYear)/4;

        System.out.println("Between 1948 to " + birthYear + ", there are " + resultLYCount + " leap years.");
        
        sc.close();
        
        // Exercise 1.3
        
        Scanner sc2 = new Scanner(System.in);
        
        System.out.println("Introduce your birth year, please.");

        int birthYearDate = sc2.nextInt();

        int leapYear = 1948;

        for (int i=leapYear; i<birthYearDate; i+=4) {
            System.out.println(i);
        }
        
        if (birthYearDate%400==0 || birthYearDate%4==0 && birthYearDate/100!=0) {
            System.out.println("It's a leap year");
        } else {
            System.out.println("It isn't a leap year");
        }

        sc2.close();
        
        // Exercise 1.4

        Scanner sc3 = new Scanner(System.in);
        
        System.out.println("Introduce your name, please.");
        String yourName = sc3.nextLine();

        System.out.println("Now, introduce your surname, please.");
        String yourSurname = sc3.nextLine();

        String completeName = yourName + " " + yourSurname; // complete variable name

        System.out.println("Introduce your day birth, please.");
        int dayBirth = sc3.nextInt();

        System.out.println("Now, introduce your month birth, please.");
        int monthBirth = sc3.nextInt();

        System.out.println("Finally, introduce your year birth, please.");
        int yearBirth = sc3.nextInt();

        String completeDate = Integer.toString(monthBirth) + "/" + Integer.toString(dayBirth) + "/" + Integer.toString(yearBirth); 

        if (yearBirth%400==0 || yearBirth%4==0 && yearBirth/100!=0) {
            System.out.println(completeName + ", " + completeDate + ". " + yearBirth + " was a leap year");
        }

        else {
            System.out.println("Your name is " + completeName + "\n" + "You were born " + completeDate + " and " + yearBirth + " was a leap year.");
        }
        
        sc3.close();
        
	}

}