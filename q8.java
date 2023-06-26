import java.util.Arrays;
public class q8 {
    public static int minDifference(int[] nums, int k) {
        if (nums.length <= k) {
            return 0;
        }

        int n = nums.length;
        int minScore = Integer.MAX_VALUE;

        Arrays.sort(nums);

        for (int i = 0; i + k - 1 < n; i++) {
            minScore = Math.min(minScore, nums[i + k - 1] - nums[i]);
        }

        return minScore;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int result = minDifference(nums, k);
        System.out.println(result);
    }
}
