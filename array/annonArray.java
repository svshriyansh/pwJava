package array;

class Calc {
    public int add(int nums[]) {
        int result = 0;
        for (int n : nums) {
            result += n;
        }
        return result;
    }
}

public class annonArray {
    public static void main(String[] args) {
        Calc c = new Calc();
        int value = c.add(new int[] { 1, 2, 3, 4, 5 });
        System.out.println(value);
    }
}
