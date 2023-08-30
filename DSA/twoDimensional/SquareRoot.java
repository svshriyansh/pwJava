package DSA.twoDimensional;

import java.util.*;;

public class SquareRoot {
    public static int findSquareRoot(int number) {
        int low = 0;
        int high = number;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long value = mid * mid;
            if (value == number) {
                return mid;
            } else if (value < number) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to find the targated value");
        int num = sc.nextInt();
        int value = findSquareRoot(num);
        System.out.println("The number is: ");
        System.out.println(value);
        sc.close();
    }
}
