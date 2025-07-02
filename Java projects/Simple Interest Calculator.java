import java.util.Scanner;
class input {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Principal : ");
    int Principal = input.nextInt();
    System.out.println("Enter Rate : ");
    int Rate = input.nextInt();
    System.out.println("Enter Time : ");
    int Time = input.nextInt();
    input.close();
    int Interest = (Principal*Rate*Time)/100;
    System.out.println("Simple Interest Generated is : " + Interest);
    	
	}
}