import java.util.Scanner;
import java.math.BigInteger;

class PR_16_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double d;
        System.out.print("Enter a decimal number: ");
        String[] decimal = input.nextLine().split("[.]");
        BigInteger b1 = new BigInteger(decimal[0]);
        BigInteger b2 = new BigInteger((decimal[1]));
        if (decimal[0].charAt(0) == '-') {
            d = b1.doubleValue() - (b2.intValue() / Math.pow(10, decimal[1].length()));
        } else {
            d = b1.doubleValue() + (b2.intValue() / Math.pow(10, decimal[1].length()));
        }
        System.out.println("The fraction number is " + d);
    }
}