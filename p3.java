import java.util.Vector;
import java.util.Collections;

public class p3 {
    public static void main(String[] args) {
        long multiple = 600851475143L;
        Vector factors = new Vector();
        boolean successful = false;
        while (multiple > 1) {
            long counter = 2L;
            successful = false;
            while (!successful) {
                if (multiple % counter == 0L) {
                    factors.add(counter);
                    multiple = multiple / counter;
                    successful = true;
                } else {
                    counter++;
                }
            }
        }
        long answer = (long) Collections.max(factors);
        System.out.println(answer);
    }
}