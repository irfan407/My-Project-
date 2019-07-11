package BasicProgrammingConcept;

public class ExcersizeQ3 {
    public static void main(String[]args) {

        double red=Double.parseDouble(args[0]);
        double green=Double.parseDouble(args[1]);
        double blue=Double.parseDouble(args[2]);

        double white=111111;
        double cyan=256336;
        double magenta=532688;
        double yellow=694512;
        double black=000000;

        white=1-black;
        red=255*white*(1-cyan);
        green=255*white*(1-magenta);
        blue=255*white*(1-yellow);

        System.out.println("Red = "+ red);
        System.out.println("Green = "+green);
        System.out.println("Blue  ="+blue);

    }
}