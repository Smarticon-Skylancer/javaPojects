import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				        System.out.println("Enter First Number : ");
		Float a = input.nextFloat();
		System.out.println("Enter Second Number : ");
		Float b = input.nextFloat();
		System.out.println("Enter Operation 1 for Addition 2 for Subtraction 4 for Division and 3 for Multplication : ");
		int Option = input.nextInt();
		input.close();
		switch (Option) {
		    case 1 : 
		       Float Solution = a + b;
		        System.out.println("Addition is "+Solution);
		        break;
		    case 2 :
		        Float Solution2 = a - b;
		        System.out.println("Subtraction is "+Solution2);
		        break;
		    case 3 :
		        Float Solution3 = a * b;
		        System.out.println("Multiplication is "+Solution3);
		        break;
		    case 4 :
		        Float Solution4 = a / b;
		        System.out.println("Division is "+Solution4);
		        break;
	          
		    }
	}
}