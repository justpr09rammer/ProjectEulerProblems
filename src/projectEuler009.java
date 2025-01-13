public class projectEuler009 {
    public static void main(String[] args) {
        //brute force approach with two loops
        for (int c = 997; c >= 1; c --){
            int sumOfAandB = 1000 - c;
            for (int a = 1; a < sumOfAandB; a++){
                int b = sumOfAandB - a;
                if (b < a){
                    break;
                }
                else {
                    if (a * a + b * b == c * c){
                        System.out.println(a * b * c);
                        return;
                    }
                }

            }

        }
    }
}
