// Description: Check if a string is palindrome or not.
package strings;
import java.util.Scanner;

public class string8 {
        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int flag=0;
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
