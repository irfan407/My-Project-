package Conditionals_and_loops.ForLoop;

public class Ex2 {
    public static void main(String[] args) {
        double N = Double.parseDouble(args[0]);

        long prod=1;

        int sum=0;
        //for(int i=1;i<=N;i++){
            //sum+=i;
        for (int i=1;i<=N; i++){
           prod*=i;
            System.out.println(prod);
        }
    }

}
