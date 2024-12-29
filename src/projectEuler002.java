import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class projectEuler002 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        Set<Integer> set = new HashSet<>();
        int maxx = -1;

        for (int i = 2; i <= n; i ++){
            while(n % i == 0){
                n /= i;
                set.add(i);
                maxx = Math.max(maxx, i);
            }
        }
        System.out.println(set);
        System.out.println(maxx);

    }


}
