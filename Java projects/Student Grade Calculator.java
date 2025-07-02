import java.util.Scanner;
class Main {
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("Enter Mathematics Score : ");
	float Mathematics_score = input.nextFloat();
	System.out.println("Enter Science Score : ");
	float Sceince_score = input.nextFloat();
    System.out.println("Enter English Score : ");
	float English_score = input.nextFloat();
    float Average = (Mathematics_score + Sceince_score + English_score)/3;
    System.out.println("Average is : " + Average);
    if (Average >= 90){
        System.out.println("Grade : A");
    }
    else if (Average >80){
        System.out.println("Grade : B");
        }
    else if(Average > 70){
        System.out.println("Grade : C");
        }
    else if(Average > 60){
        System.out.println("Grade : D");
        }
    else{
        System.out.println("Grade : F");
        }
       input.close();
	}
}