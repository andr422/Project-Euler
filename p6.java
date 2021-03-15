public class p6 {
    public static void main(String[] args) {
        long square;
        long sumOfSquares = 0L;
        long sumOfNumbers = 0L;
        long squareOfSumOfNumbers;
        long difference;
        for (long i = 0L; i <= 100L; i++) {
            square = i*i;
            sumOfSquares+=square;
        }
        for (long i = 0L; i <= 100L; i++) {
            sumOfNumbers +=i;
        }
        squareOfSumOfNumbers = sumOfNumbers*sumOfNumbers;
        difference =  squareOfSumOfNumbers - sumOfSquares;
        System.out.println(difference);
    }
}
