import java.util.Scanner;
public class Main{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        long Number = input.nextLong();
        if (Number == 0){
            System.out.println("Factorial is 1");
        }
        else if (Number != 0){
            long fact = 1;
            for(int i = 1; i<= Number; i++){
                fact *=i;
       
        }   
            }
        System.out.println("Factorial is " + fact);    
        }
        else{
           System.out.println("Factorial Not defined for Negative Numbers !!! ");
    }
}