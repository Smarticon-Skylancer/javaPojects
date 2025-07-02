
import java.util.Scanner;

public class Problem {

    public static void main(String[] args) {
        int Sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Total Number of Book A sold : ");
        int BookA = input.nextInt();
        System.out.println("Enter the Total Number of Book B sold : ");
        int BookB = input.nextInt();
        System.out.println("Enter the Total Number of Book C sold : ");
        int BookC = input.nextInt();
        System.out.println("Enter the Total Number of Book D sold : ");
        int BookD = input.nextInt();
        System.out.println("Enter the Total Number of Book E sold : ");
        int BookE = input.nextInt();
        int[] totalBooks = {BookA, BookB, BookC, BookD, BookE};
        for (int Book : totalBooks) {
            Sum += Book;
        }
        System.out.println("The Sum of the Books Entered are : " + Sum);

        if (BookA >= BookB && BookA >= BookC && BookA >= BookD && BookA >= BookE) {
            System.out.println("The The Largest Number is " + BookA);
        } else if (BookB >= BookA && BookB >= BookC && BookB >= BookD && BookB >= BookE) {
            System.out.println("The The Largest Number is " + BookB);
        } else if (BookC >= BookA && BookC >= BookB && BookC >= BookD && BookC >= BookE) {
            System.out.println("The The Largest Number is " + BookC);

        } else if (BookD >= BookA && BookD >= BookC && BookD >= BookB && BookD >= BookE) {
            System.out.println("The The Largest Number is " + BookD);

        } else if (BookE >= BookA && BookE >= BookE && BookB >= BookD && BookE >= BookB) {
            System.out.println("The The Largest Number is " + BookE);

        }
    }

}
