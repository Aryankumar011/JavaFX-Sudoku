import java.sql.Array;
import java.util.Arrays;

public class Sorting {
        public static void main(String[] args) {
          int []A={8,99,56,44,3,22,9};
          for (int i : A) {
            System.out.print(i+"\t");
        }
        
        System.out.println();
        Arrays.sort(A);
        for (int i : A) {
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(A,56));
        }
}
