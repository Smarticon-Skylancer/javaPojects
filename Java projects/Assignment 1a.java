import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Number : ");
	int Number = input.nextInt();
	if (Number > 0){
		if (Number % 2 == 0){System.out.println("Positive Even Number Entered");}
		else {System.out.println("Positive Odd Number Entered");
		}
		
		}
	else if(Number == 0){
	    System.out.println("Zero Entered");
	}
    else{
        System.out.println("Negative Number Entered");
        }
        

	}
	
}