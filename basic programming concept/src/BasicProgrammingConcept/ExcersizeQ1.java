package BasicProgrammingConcept;

import java.util.Scanner;

public class ExcersizeQ1 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first name");
        System.out.println("Enter your last Name");


        String name=input.next();
        String name1=input.next();

        System.out.println("Hello " + name+" and "+name1 );

       System.out.println("Goodbye " + name1+" and " +name);
    }
}
