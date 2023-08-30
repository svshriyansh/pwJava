package DSA.Stack;

import java.util.Stack;

public class validSubarray {

    public static int solution(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] nextSmaller = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                nextSmaller[i] = nums.length;

            } else {
                while ((!stack.isEmpty()) && nums[stack.peek()] > nums[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    nextSmaller[i] = nums.length;
                } else {
                    nextSmaller[i] = stack.peek();
                }
            }
            stack.push(i);
        }

        for (int i : nextSmaller) {
            System.out.print(i);
        }
        System.out.println();
        int sum = 0;
        int j = 0;
        for (int i : nextSmaller) {
            sum += i - j;
            j += 1;
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 4, 2, 5, 3 };
        int ans = solution(nums);
        System.out.println(ans);
    }
}
