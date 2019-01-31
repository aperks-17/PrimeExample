import java.util.Scanner;

public class PrimeExample
{
public static void main(String[] args)
{    
   isPrime();
}

public static void isPrime()
{
        Scanner input=new Scanner(System.in);
        //prompt user for a number
        boolean playAgain = true;
        
        
        do
        {
                boolean prime=true;
                System.out.println("Please enter a number");
                int number=input.nextInt();                
                //determine if that number if prime
                int m = number/2;

                if(number==0||number==1)
                {           
                    prime=false;
                }
                for(int i=2; i<=m; i++)
                {
                    if(number%i==0)
                    {
                        prime=false;
                    }
                }
            


                if(prime==true)
                {
                    System.out.println("This is a prime number");
                }
                else{
                    System.out.println("This is not a prime number");
                }

                System.out.println("Do you want to try another number? (Y or N) ...");
                
                String playAgainStr=input.next();

                if(playAgainStr.equals("N"))
                {
                    playAgain = false;
                }

        }while(playAgain);

        input.close();
        //print the result
        //prompt user to play again

        //return prime;
    }
}