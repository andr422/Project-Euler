public class p4 {
    public static void main(String[] args) {
        solve();
    }

    public static boolean checkPalindromeMain (int i) {
        int[] arr = getDigits(i);
        return checkPalindrome(arr);
    }



    public static void solve () {
        int product;
        int answer = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                product = i*j;
                if (checkPalindromeMain(product)&&product>answer) {
                    answer = product;
                }
            }
        }
        System.out.println(answer);
    }


    public static boolean checkPalindrome (int[] array) {
        int indexCheckOne;
        int indexCheckTwo;
        int maxIndex = (array.length-1);
        for (int i = 0; i < array.length; i++) {
            indexCheckOne = array[i];
            indexCheckTwo = array[(maxIndex-i)];
            if (indexCheckOne!=indexCheckTwo) {
                return false;
            }
        }
        return true;
    }



    public static int checkLength (int n) {
        int length = 0;
        boolean checkLength = true;
        while (checkLength) {
            n = n/10;
            length++;
            if (n==0) {
                checkLength = false;
            }
        }
        return length;
    }



    public static int[] getDigits (int n) {
        int counter = 0;
        int[] arr = new int[checkLength(n)];
        while(n>0) {
            arr[counter] = n%10;
            counter++;
            n = n/10;
        }
        return arr;
    }
}