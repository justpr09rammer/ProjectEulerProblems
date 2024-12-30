import java.util.Scanner;

public class projectEuler001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0, sum1 = 0, sum2 = 0, target = 1000;
        while (a + 3 < target){
            a += 3;
            sum1 += a;
        }
        while (b + 5 < target){
            b += 5;
            if (b % 3 == 0){
                continue;
            }
            sum2 += b;
        }
        System.out.println(sum1 + sum2);
    }
}
