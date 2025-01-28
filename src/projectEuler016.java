import java.util.Scanner;
import java.math.BigInteger;

public class projectEuler016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long n = scanner.nextLong();
        BigInteger number = power(n);
        System.out.println(number);
        System.out.println(digitSum(number));
    }

    public static BigInteger power(Long n) {
        if (n == 0) {
            return BigInteger.ONE;
        }
        if (n % 2 != 0) {
            return BigInteger.valueOf(2).multiply(power(n - 1));
        }
        else {
            BigInteger halfPower = power(n / 2);
            return halfPower.multiply(halfPower);
        }
    }
    public static BigInteger digitSum(BigInteger number) {
        String numberString = number.toString();
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < numberString.length(); i++) {
            sum = sum.add(BigInteger.valueOf(Character.getNumericValue(numberString.charAt(i))));
        }
        return sum;
    }
}