package DSA.Queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class slidingWindow {

    public static void sliding(int[] nums, int k, ArrayList<Integer> ans) {
        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) {
                queue.removeLast();
            }
            queue.addLast(i);
        }

        for (int i = k; i < nums.length; i++) {
            ans.add(nums[queue.peek()]);

            // to maintain the sliding window we will eleminate the index value which will
            // be not in the kange of k
            // ! example = queue index = 0 and i = 3 thus i-k => 3-3 => 0 ThereFore we have
            // to remove 0 index
            while (!queue.isEmpty() && queue.peek() <= i - k) {
                queue.removeFirst();
            }
            while (!queue.isEmpty() && nums[queue.peekLast()] < nums[i]) {
                queue.removeLast();
            }
            queue.addLast(i);

        }
        ans.add(nums[queue.peek()]);
    }

    public static void main(String[] args) {
        int[] nums = { 1, -1 };
        int k = 1;
        ArrayList<Integer> ans = new ArrayList<>();

        sliding(nums, k, ans);
        for (int i : ans) {
            System.out.print(i + " ");
        }

    }
}
