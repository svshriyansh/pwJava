//TC = O(log n base 2)
package DSA.Recursion;

import java.math.BigInteger;
import java.util.*;

public class PowOfNOptimz {
    public static BigInteger powOfN(BigInteger a, int b) {
        BigInteger result, finalresult;

        if (b == 1) {
            return a;
        } else {
            result = powOfN(a, b / 2);
            finalresult = result.multiply(result);
            if (b % 2 == 0) {
                return finalresult;
            } else {
                return a.multiply(finalresult);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base value");
        BigInteger a = sc.nextBigInteger();
        System.out.println("Enter the power for the base value");
        int b = sc.nextInt();
        BigInteger result = powOfN(a, b);
        System.out.println("The ans is : " + result);
        sc.close();
    }
}
