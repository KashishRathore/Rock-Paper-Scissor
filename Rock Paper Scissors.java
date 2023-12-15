import java.util.Scanner;
import java.util.Random;

public class Exercise_2 {
    public static void main(String[] args) {

    //Rock Paper Scissors
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 0 for rock , 1 for paper , 2 for scissor");
    int userInput = sc.nextInt();

    Random random = new Random();
    int computerInput = random.nextInt(3);

    if(userInput == computerInput){
        System.out.println("Draw");
        System.out.println("Your Input : " +userInput);
        System.out.println("Computer input : " +computerInput);
    }

    else if(userInput == 0 && computerInput == 1 || userInput == 1 && computerInput == 2 || userInput == 2 && computerInput == 0){
        System.out.println("Computer Win");
        System.out.println("Your Input : " +userInput);
        System.out.println("Computer input : " +computerInput);
    }

    else{
        System.out.println("You Win");
        System.out.println("Your Input : " +userInput);
        System.out.println("Computer input : " +computerInput);
    }
    }
}
