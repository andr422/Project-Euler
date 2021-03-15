public class p7 {
    public static void main(String[] args) {
        int counter = 0;
        boolean go = true;
        int checkNum = 0;
        while (go) {
            if (checkPrime(checkNum)) {
                counter++;
            }
            if (counter==10001) {
                System.out.println(checkNum);
                go = false;
            }
            checkNum++;
        }
    }
    public static boolean checkPrime(int n) {
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (n%(i+1)==0) {
                counter ++;
            }
        }
        return checkCounter(counter);
    }
    public static boolean checkCounter(int counter) {
        boolean result = false;
        if (counter==2) {
            result = true;
        }
        return result;
    }
}