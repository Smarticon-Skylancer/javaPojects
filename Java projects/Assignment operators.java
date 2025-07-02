public class Main {
	public static void main(String[] args) {
    double Budget = 1000;
    System.out.println("Budget is "+Budget);
    Budget += 200;
    System.out.println("Added Bunos we get " + Budget);
    Budget -= 150;
    System.out.println("Removed Expenses we get "+ Budget);
    Budget *= 0.95;
    System.out.println("Applied 5% Savings we get " + Budget);
    Budget /= 2;
    System.out.println("Divide the Adjusted Budget we get " + Budget);
    Budget %= 100;
    System.out.println("Remainder after Division by 100 is "+Budget);
	}
}