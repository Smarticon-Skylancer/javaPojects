import java.util.Scanner;
public class Night {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Distance of the Journey : ");
    int Distance = input.nextInt();
    System.out.println("Enter fuel Needed for the Journey : ");
    int Fuel = input.nextInt();
    System.out.println("Enter fuel per 100 Kilometer : ");
    int fuel_per_km = input.nextInt();
    System.out.println("Enter fuel Tank Capacity : ");
    int Tank_capacity = input.nextInt();
    System.out.println("Enter fuel Cost : ");
    int Fuel_cost = input.nextInt();
    int Total_fuel_Needed = Fuel* (Distance/100);
    System.out.println("total : ");
    

    
    }