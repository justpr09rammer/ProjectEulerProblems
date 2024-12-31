import java.util.Scanner;

public class projectEuler003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long target = 600851475143L;
        long maxx = -1;
        for (long i = 2; i <= target; i++) {
            while (target % i == 0) {
                target /= i;
                maxx = i;
            }
        }
        System.out.println(maxx);
    }
}
