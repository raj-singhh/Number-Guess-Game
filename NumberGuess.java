import java.util.Scanner;
import java.util.Random;
public class NumberGuess {
    public static void main(String[] args)
    {
      
      Scanner sc= new Scanner(System.in);
      Random rand= new Random();
      String play="yes";
      while(play.equals("yes"))//Check Here!!
      {
        int randNum = rand.nextInt(100);
        int guess = -1;
        int tries = 0;
        while(guess!=randNum)
        {
          System.out.print("Guess a Number Between 1 to 100: ");
          guess= sc.nextInt();
          tries++;
          if(guess==randNum)
          {
            System.out.println("Awesome! You Guessed the Right Answer.");
            System.out.println("You guess the Number in "+ tries +" attempts Only");
            System.out.println("Do You Want to Play Again?");
            System.out.println("Type Yes or No:");
            play=sc.next().toLowerCase();//Check Here!!
          }
          else if(guess>randNum)
          {
            System.out.println("Your guess too High,try again");
          }
          else
          {
            System.out.println("Your guess too Low,try again");
          }
        }
      }
      sc.close();
    } 
}