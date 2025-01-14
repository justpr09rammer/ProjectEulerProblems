import java.util.Scanner;

public class projectEuler005 {
    public static void main(String[] args) {
        findSmallestMultiple(7);
    }
    public static void findSmallestMultiple(long target) {
        long ans = 1;
        for (long i = 1; i <= target; i++) {
            ans = LCM(ans, i);
        }
        System.out.println(ans);
    }
    public static long GCD(long a, long b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }

    public static long LCM(long a, long b) {
        return a * b / GCD(a, b);
    }

}
