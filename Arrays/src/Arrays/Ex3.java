package Arrays;

public class Ex3 {
    public static void main(String[] args) {

        int N=Integer.parseInt(args[0]);

        String[] rank = {"2", "3", "4", "5", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suit=  { "♣", "♦", "♥", "♠" };
        String[]deck=new String[52];
        for (int j=0;j<4;j++)
            for (int i=0;i<13;i++)
                deck[i+13*j]= rank[i] + suit[j];

            for (int i=0;i<N;i++){
                int r=(int)(Math.random()*52);
                System.out.println(deck[r] +" ");
            }


            System.out.println();
    }

}
