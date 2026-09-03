import java.util.*;

public class NextPermutation {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    public void generate(int[] nums, boolean[] used, ArrayList<Integer> temp) {

        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i])
                continue;

            used[i] = true;
            temp.add(nums[i]);

            generate(nums, used, temp);

            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }

    public void nextPermutation(int[] nums) {

        generate(nums, new boolean[nums.length], new ArrayList<>());

        Collections.sort(ans, (a, b) -> {
    for (int i = 0; i < a.size(); i++) {
        if (!a.get(i).equals(b.get(i))) {
            return a.get(i) - b.get(i);
        }
    }
    return 0;
});

        int index = 0;

        for (int i = 0; i < ans.size(); i++) {

            boolean same = true;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != ans.get(i).get(j)) {
                    same = false;
                    break;
                }
            }

            if (same) {
                index = i;
                break;
            }
        }

        ArrayList<Integer> next = ans.get((index + 1) % ans.size());

        for (int i = 0; i < nums.length; i++) {
            nums[i] = next.get(i);
        }
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        NextPermutation solution = new NextPermutation();
        solution.nextPermutation(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

