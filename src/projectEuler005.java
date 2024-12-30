import java.util.Scanner;

public class projectEuler005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long ans = 1;
        long target = scanner.nextLong();
        for (long i = 1; i <= target; i ++){
            ans = LCM(ans, i);
        }
        System.out.println(ans);
    }
    public static long GCD(long a, long b) {
        if(b == 0){
            return a;
        }
        if(a == 0){
            return b;
        }
        if(a > b){
            return GCD(a % b, b);
        }
        return GCD(a, b % a);
    }
    public static long LCM(long a, long b) {
        return a * b / GCD(a, b);
    }
}
