import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 *  
 *
 * 示例：
 *
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 *
 * 先排序，a + b = -c, 三指针，k指针表示-c，i，j在两端比较值大小，如果a+b比-c大，j左移，小则i右移
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        for (int k = 0; k < nums.length - 2; k++) {
            if (k == 0 || (k > 0 && nums[k] != nums[k-1])) {
                int lo = k+1, hi = nums.length-1, sum = 0-nums[k];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        lists.add(Arrays.asList(nums[k],nums[lo],nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo+1]) lo++;
                        while (lo < hi && nums[hi] == nums[lo-1]) hi--;
                        lo++;hi--;
                    }else if (nums[lo] + nums[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
