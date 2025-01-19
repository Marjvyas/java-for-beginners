package java_for_beginners.mini_projects;
import java.util.Random;
import java.util.Scanner;
class game{
    Scanner sc=new Scanner(System.in);
    Random r=new Random();
    private int comp, start, end;
    private int player;
    private int sum=0;


    public game(){
        System.out.print("Enter lowerbound:");
        start=sc.nextInt();
        System.out.print("Enter upperbound:");
        end=sc.nextInt();
        comp=r.nextInt(start, end+1);
    }
    public void takeUserInput(){
        System.out.print("Enter your guess: ");
        player=sc.nextInt();
        sum+=1;
    }
    public int getplayer(){
        return player;
    }
    public int getcomp(){
        return comp;
    }
    public boolean isCorrectNumber(){
        if(player<start || player>end){
            return false;
        }
        return true;
    }
    public int noOfGuesses(){
        return sum;
    }
}
public class number_guessing {
    public static void main(String[] args) {
        /*
            Create a class Game, which allows a user to play "Guess the Number" game once.

            Game should have the following methods:
                Constructor to generate the random number
                takeUserInput() to take a user input of number
                isCorrectNumber() to detect whether the number entered by the user is true
                getter and setter for noOfGuesses
                Use properties such as noOfGuesses(int), etc to get this task done!
         */
        game p1=new game();
        while(true){
            p1.takeUserInput();
            if(!p1.isCorrectNumber()){
                System.out.println("number is out of range...");
                continue;
            }
            int player=p1.getplayer();
            int comp=p1.getcomp();
            if(player==comp){
                System.out.println("You find it!!!!");
                System.out.println("Your score:");
                System.out.println(p1.noOfGuesses());
                break;
            }
            else if(player<comp){
                System.out.println("To low..");
            }
            else{
                System.out.println("To high..");
            }
        }
        

    }
}
