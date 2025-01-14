public class projectEuler004 {
    public static void main(String[] args) {
        largestPalindromeProduct(3);
    }
    public static void largestPalindromeProduct(long n) {
        long maxx = -1;
        long upper = (long) (Math.pow(10,n) - 1);
        long lower = (long) (Math.pow(10,n - 1));
        for (long i = upper; i >= lower; i--) {
            for (long j = upper; j >= lower; j--) {
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
