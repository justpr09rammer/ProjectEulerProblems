import java.util.HashSet;
import java.util.Set;

public class projectEuler010 {
    public static void main(String[] args) {
        Set<Long> set = new HashSet<>();
        set.add(2L);
        set.add(3L);
        long sum = 2 + 3;
        for (long i = 5; i < 2000000; i ++){
            boolean isPrime = true;
            for (long element : set){
                if (i % element == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                set.add(i);
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
