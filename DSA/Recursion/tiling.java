package DSA.Recursion;

public class tiling {
    public static int Getways(int n) {
        if (n <= 3) {
            return n;
        }
        return Getways(n - 1) + Getways(n - 2);
    }

    public static void main(String[] args) {
        int result = Getways(5);
        System.out.println(result);
    }
}
