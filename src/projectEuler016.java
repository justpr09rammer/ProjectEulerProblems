import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;
import java.math.BigInteger;

public class projectEuler016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        BigInteger ans1 = power(n);

        long ans2 = digitSum(ans1);
        System.out.println(ans2);
    }

    public static BigInteger power(long exponent) {
        BigInteger result = BigInteger.ONE;
        BigInteger base = BigInteger.valueOf(2);
        while (exponent > 0) {
            if (exponent % 2 != 0) {
                result = result.multiply(base);
            }
            base = base.multiply(base);
            exponent /= 2;
        }
        return result;
    }
    public static long digitSum(BigInteger number) {
        long sum = 0;
        String numStr = number.toString();
        for (int i = 0; i < numStr.length(); i++) {
            sum += Character.getNumericValue(numStr.charAt(i));
        }
        return sum;
    }
}