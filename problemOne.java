public class problemOne {
    public static void main(String[] args) {
        System.out.println(findSum());
    }


    public static int findSum() {
        int result = 0;
        for (int i = 0; i < 1000; i++) {
            if(checkMultiple(i)) {
                result += i;
            }
        }
        return result;
    }


    public static boolean checkMultiple(int i) {
        return ((i%3==0)||(i%5==0));
    }
}
