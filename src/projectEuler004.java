public class projectEuler004 {
    public static void main(String[] args) {
        long maxx = -1;
        for (long i = 999; i >= 100; i--) {
            for (long j = 999; j >= 100; j--) {
                long multiplication = i * j;
                StringBuilder s = new StringBuilder();
                s.append(multiplication);
                if (isPalindrome(s.toString())) {
                    if(maxx < multiplication) {
                        maxx = multiplication;
                    }
                }

            }
        }
        System.out.println(maxx);
    }
    public static boolean isPalindrome(String s) {
        int pointerLeft = 0;
        int pointerRight = s.length() - 1;
        while (pointerLeft < pointerRight) {
            if (s.charAt(pointerLeft) != s.charAt(pointerRight)) {
                return false;
            }
            pointerLeft++;
            pointerRight--;
        }
        return true;
    }
}
