import java.util.Date;
import java.util.Scanner;

class Test2 {
public static void main(String[] args) {
    // double a=20.20;
    // System.out.print(23.20%3);
   /*  String S1="Hello";
    String S2="Hello";
    Scanner Sc = new Scanner(System.in);
    
    System.out.println(S1.hashCode());
    System.out.println(S2.hashCode());
    if(S1==S2)
    {
    System.out.println("Same");
    S2=Sc.nextLine();
    }
    else
    System.out.println("Different");
    System.out.println(S1);
    System.out.println(S2);
    System.out.println(S1.hashCode());
    System.out.println(S2.hashCode()); */

    // int A=10_20_30_40;
    // System.out.println(A);
    // System.out.println(System.currentTimeMillis() );
    // System.currentTimeMillis();

 /*    int[] A = new int[5];
for (int i : A) {
    System.out.println(i);
 //   System.out.println(args[i]);
} */
  Date date = new Date();
  System.out.println(date.toString());
  System.out.println(date.getTime());
  System.out.println(date.getHours());
  System.out.println(date.hashCode());
    
}
    
}