package functions;

public class varargs {
    static int sum(int ...arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(varargs.sum(2,5,6,5,4));
    }
}
