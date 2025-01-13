import java.util.*;

public class projectEuler003 {
    public static void main(String[] args) {
        largestPrimeFactor(13195);
    }
    public static void largestPrimeFactor(long number){
        long maxx = -1;
        for (long i = 2; i <= number; i ++){
            while (number % i == 0){
                number /= i;
                maxx = Math.max(maxx, i);
            }
        }
        System.out.println(maxx);
    }
}
