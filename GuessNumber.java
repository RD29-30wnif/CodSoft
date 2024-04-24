import java.util.Scanner;
import java.util.Random;
class GuessNumber 
{
public static void main(String args[])
{
System.out.println("\n You have 3 chances to guess correct no and win this game \n\n The Range limit is 1 to 100\n\n\n All The Best Dear");

int number;
Random random= new Random();
number = random.nextInt(100);

for(int i=0;i<3;i++)
{
System.out.println(" Guess the Generated no. : ");
Scanner sc = new Scanner(System.in);
int guessed = sc.nextInt();

if(guessed==number)
{
System.out.println("Congratulations you win the game !!! ");
break;
}
else
{
  if(guessed<number)
  {System.out.println(" Low Too ");
  }
  else if(guessed>number)
  {System.out.println(" High Too ");
  }

continue;
}
}
System.out.println("Generated no is : "+number);

}
}