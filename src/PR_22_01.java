import java.util.Scanner;

public class PR_22_01 {
    
    public static int findSmallestInteger(int[] array) {
        return findSmallestIntegerRecursive(array, 0, array.length - 1);
    }

    private static int findSmallestIntegerRecursive(int[] array, int start, int end) {
        if (start == end) {
            return array[start];
        } else {
            int mid = (start + end) / 2;
            int leftSmallest = findSmallestIntegerRecursive(array, start, mid);
            int rightSmallest = findSmallestIntegerRecursive(array, mid + 1, end);
            return Math.min(leftSmallest, rightSmallest);
        }
    }

    public static void main(String[] args) {
       // int[] array = {5, 8, 3, 2, 4, 9, 4};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five integers: ");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        int smallestInteger = findSmallestInteger(array);
        System.out.println("The smallest integer in the array is: " + smallestInteger);
    }
}
