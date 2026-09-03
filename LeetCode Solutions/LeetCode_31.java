public class LeetCode_31 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        // Step 1: Find the first decreasing element from right
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // Step 2: If index exists, find the next greater element
        if (index != -1) {
            for (int i = n - 1; i > index; i--) {
                if (nums[i] > nums[index]) {
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }
        }

        // Step 3: Reverse everything after index
        int left = index + 1;
        int right = n - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        LeetCode_31 solution = new LeetCode_31();
        solution.nextPermutation(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
