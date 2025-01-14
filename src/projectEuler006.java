import java.util.Scanner;

public class projectEuler006 {
    public static void main(String[] args) {
        sumSquareDifference(100);
    }
    public static void sumSquareDifference(long n){
        long sum1 = (long) Math.pow((n * (n + 1)) / 2, 2);
        long sum2 = 0;
        for (long i = 1; i <= n; i++) {
            sum2 += i * i;
        }
        System.out.println(sum1 - sum2);
    }
}
