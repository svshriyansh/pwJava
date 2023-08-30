//we are having nand k where we need to print number n in multiples og k times
package DSA.Recursion;

public class printMultiple {
    public static void multiple(int n, int k) {
        if (k == 1) {
            System.out.println(n);
            return;
        }
        multiple(n, k - 1);
        System.out.println(n * k);
    }

    public static void main(String[] args) {
        multiple(4, 10);
    }
}
