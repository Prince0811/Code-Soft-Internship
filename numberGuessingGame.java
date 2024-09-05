import java.util.*;
class NumberGame{
    public static int getRandN(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int finals=0;
        int chances =9;
        boolean playAgain=true;
        System.out.println("Welcome buddy to number guessing game! ");
        System.out.println("Try your Luck!");
        while(playAgain){
            int rand=getRandN(1,100);
            boolean guess=false;
            for(int i =1;i<=chances;i++){
                System.out.println("Its Your "+i+" chance : Guess the number");
                int userGuess=sc.nextInt();
                if(userGuess==rand){
                    guess=true;
                    finals++;
                    System.out.println("You won it!");
                    break;
                }else if(rand>userGuess){
                    System.out.println("Too low");
                }else{
                    System.out.println("Too High");
                }
            }
            if(guess==false){
                System.out.println("Sorry you reached your maximum attempts, The number is: "+rand);
            }
            System.out.println("Do you want to play again?");
            String pA=sc.next();
            playAgain=pA.equalsIgnoreCase("y");
        }
        System.out.println("Thats it, Hope you enjoyed the game");
        System.out.println("Here is your final Score: "+finals);
    }
