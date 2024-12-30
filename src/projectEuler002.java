import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class projectEuler002 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] dp = new int[100000];
        int sum = 0;
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i < dp.length; i++){
            dp[i] = dp[i-1] + dp[i-2];
            if (dp[i] < 4000000){

                if (dp[i] % 2 == 0){
                    sum += dp[i];
                }
            }
            else break;
        }
        System.out.println(sum);
    }


}
