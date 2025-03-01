import java.util.Scanner;

public class area_of_parallelogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int B=sc.nextInt();
        int H=sc.nextInt();
        if(B>0 && H>0){
            System.out.println(B*H);
        }
        else{
            System.out.println(new Exception("Breadth and height must be positive"));
        }
}
}
