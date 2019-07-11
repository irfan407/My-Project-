package Conditionals_and_loops.Conditional_If_statment;

public class TwoValueInOrder {
    public static void main(String[]args){
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);

        if(a<b) {
            int t = a;
            a = b;
            b = t;
        }
        System.out.println( "value of a is :"+a);
        System.out.println("value of a is :"+b);
        }
    }

