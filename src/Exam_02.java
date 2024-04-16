import java.util.Scanner;

public class Exam_02 {
    public static void main(String[] args) {
        Integer[] foo = new Integer[10];
        Scanner scanner = new Scanner(System.in);
for (int i = 0; i < foo.length; i++) {
        foo[i]=scanner.nextInt();
}
        
        
        int max=foo[0];
        for (int i=1 ; i<foo.length;i++) {
            if (max<foo[i]) {
                max = foo[i];
            }
       // int max = Integer.parseInt(args[0]);
/*         for (int i=1 ; i<args.length;i++) {
            if (max<Integer.parseInt(args[i])) {
                max = Integer.parseInt(args[i]);
            }
        } */
        System.out.println(max);
    }
}
}
