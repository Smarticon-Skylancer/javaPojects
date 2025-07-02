import java.util.Random;
import java.util.Scanner;
class input {
	public static void main(String[] args) {
    int User_score = 0;
    int Computer_score = 0;
    Random rand = new Random();
    int Computer = rand.nextInt(3)+1;
    String Choice = "mine";
    if (Computer == 1){
        Choice = "rock";
    }
    else if (Computer == 2){
        Choice = "paper";
    }
    else if (Computer == 3){
        Choice = "scissors";
    }

    Scanner input = new Scanner(System.in);
    System.out.println("Enter Choice : ");
    String User = input.next();
    while (true){
        if (User == "rock" & Choice == "scissors"){
        System.out.println("You won");
        User_score =+1;
        System.out.println("Your score : " + User_score);
        System.out.println("Computer Score : " + Computer_score);
        }
        else if (User == "scissors" & Choice == "paper"){
        System.out.println("You won");
        User_score =+1;
        System.out.println("Your score : " + User_score);
        System.out.println("Computer Score : " + Computer_score); 
        }
        else if (User == "paper" & Choice == "rock"){
        System.out.println("You won");
        
        User_score =+1;
        System.out.println("Your score : " + User_score);
        System.out.println("Computer Score : " + Computer_score);
        }
        else{
        System.out.println("You lose");
        Computer_score =+1;
        System.out.println("Your score : " + User_score);
        System.out.println("Computer Score : " + Computer_score);  
        }
            
        }
    }
}