import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class projectEuler010 {
    public static void main(String[] args) {
        System.out.println(findSumOfPrimes(2000000));
    }
    public static long findSumOfPrimes(int n){
        long[] primes = new long[n + 1];
        long sumOfPrimes = 0;
        for (int i = 2; i <= n; i++) {
            primes[i] = 1;
        }
        for (long i = 2; i <= n; i ++){
            if (primes[(int) i] == 1){
                sumOfPrimes += i;
                for (long j = (long) i * i; j <= n; j += i) {
                    primes[(int) j] = 0;
                }
            }
        }
        return sumOfPrimes;
    }
}
