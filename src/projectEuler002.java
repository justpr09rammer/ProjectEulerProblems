import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class projectEuler002 {
    public static void main(String[] args){
        fiboEvenSum(34);
    }
    public static void fiboEvenSum(int n){
        int sum = 0;
        int first = 1;
        int second = 1;
        while (second <= n){
            if (second % 2 == 0){
                sum += second;
            }
            int temp = second;
            second = second + first;
            first = temp;
        }
        System.out.println(sum);
    }
}
