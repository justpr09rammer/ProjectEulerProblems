import java.util.Scanner;

public class projectEuler006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = 100;
        long sum1 = n * (n + 1) / 2;
        sum1 *= sum1;
        long sum2 = 0;
        for (long i = 1; i <= n; i ++){
            sum2 += (i * i);
        }
        System.out.println(sum1 - sum2);

    }
}
