import java.util.Random;
import java.util.Scanner;
public class nogussing{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;
        int total_score=0;

        while(playAgain){
            int attempts = 0;
            int maxaatemp =5;
            int randomNumber = rand.nextInt(100)+1;
            boolean guess = false;
            System.out.println("Guess the number betn 1 to 100, you have"+maxaatemp+"attempts");
            while(attempts< maxaatemp && !guess){
                System.out.println("Enter your guess: ");
                int userguess = sc.nextInt();
                attempts++;
                if (userguess == randomNumber){
                    System.out.println("Congratulation");
                    guess= true;
                }
                else if(userguess < randomNumber){
                    System.out.println("Too low, try again");
                }else {
                    System.out.println("Too high , try again.");
                }
                if (attempts == maxaatemp && !guess){
                    System.out.println("you have used all your attempts. the correct nmber was:"+randomNumber);                   
                }
            }
            if(guess){
                total_score += (maxaatemp - attempts +1);
            }
            System.out.println("your correct score: "+total_score+ "");
            
   

    }
    
}