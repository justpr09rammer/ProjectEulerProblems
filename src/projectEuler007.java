import java.util.HashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.Set;

public class projectEuler007 {
    public static void main(String[] args) {
        System.out.println(nthPrime(10001));
    }

    public static long nthPrime(long size) {
        Set<Long> set = new HashSet<>();
        set.add(2L);
        set.add(3L);
        long temp = 2;
        long ans = -1;

        for (long i = 5; i <= 999999999; i++) {
            boolean isPrime = true;

            for (long element : set) {
                if (i % element == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                set.add(i);
                if (temp != size) {
                    temp++;
                    ans = i;
                } else {
                    break;
                }
            }
        }

        return ans;
    }
}
