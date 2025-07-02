import java.util.Scanner;
public class mmmm {
	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("TEMPERATURE CONVERTER");
        System.out.println("Enter 1 for Celcuis to Kelvin 2 for Kelvin to Celcius Q to Quit");
        System.out.println("Enter Choice of Operation : ");
        int Operation = input.nextInt();
        switch(Operation){
            case 1 :
               System.out.println("Enter Temperature in celcuis : ");
               Double Temperature1 = input.nextDouble();
              
               Double Solution = Temperature1 + 273.15;
               System.out.println("Temperature in Kelvin is : "+ Solution + " Kelvin");
               break;

            case 2 :
                System.out.println("Enter Temperature in Kelvin : ");
                Double Temperature2 = input.nextDouble();
                Double Solution2 = Temperature2 - 273.15;
                System.out.println("Temperature in celcuis is : "+ Solution2 + " Celcius");
                break;
            }         

    }

}