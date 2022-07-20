package ArithOpProgs;

import java.util.Scanner;

class SumProg {

    public int addTwoInteger ()  {

        Scanner in = new Scanner(System.in);
        System.out.println("Entered integer value a to add" );
         int a = in.nextInt();
        System.out.println("Entered integer value b to add");
         int b = in.nextInt();
        System.out.println("Entered integer value to be added " + a +"& "+b );
        //System.out.println(c);
        return a+b;
    }
}