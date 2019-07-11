package Conditionals_and_loops.ForLoop;

public class Ex1 {
    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        int v = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(i + " "+ v);
            v=v*2;
        }
    }
}