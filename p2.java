public class p2 {
    public static void main(String[] args) {
        long sum = 0;
        long lastNum = 0;
        long firstNum = 1;
        while (firstNum<=4000000) {
            if (lastNum%2==0) {
                sum += lastNum;
            }
            if (firstNum%2==0) {
                sum += firstNum;
            }
            lastNum = lastNum+firstNum;
            firstNum = lastNum+firstNum;
        }
        System.out.println(sum);
    }
}
