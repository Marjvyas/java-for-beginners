package java_for_beginners.mini_projects;

import java.util.Scanner;
import java.util.Random;
public class rock_paper_scissors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r= new Random();
        String[] arr={"rock","paper","scissors"};
        int computer_total=0;
        int player_total=0;
        while (computer_total<5 && player_total<5){
            System.out.print("\nEnter your choice: ");
            String player=sc.nextLine().toLowerCase();
            int a=r.nextInt(arr.length);
            String computer=arr[a];
            System.out.println("\nYou: "+player);
            System.out.println("Computer: "+computer);
            if((computer.equals("rock") && player.equals("paper")) || (computer.equals("paper") && player.equals("scissors")) || (computer.equals("scissors") && player.equals("rock"))){
                player_total+=1;
                System.out.println("You win !!!");
            }
            else if((player.equals("rock") && computer.equals("paper")) || (player.equals("paper") && computer.equals("scissors")) || (player.equals("scissors") && computer.equals("rock"))){
                computer_total+=1;
                System.out.println("You loose !!!");
            }
            else if(player.equals(computer)){
                System.out.println("It's Tie.");
            }
            else{
                System.out.println("Invalid entry...");
                continue;
            }
            System.out.println("\n Score Board: ");
            System.out.println("Your score: "+player_total);
            System.out.println("Computer Score: "+computer_total);
        }
        String b= (player_total>computer_total) ? "You" : "Computer";
        System.out.format("\n%s won the game !!!",b);
    }
    
}
