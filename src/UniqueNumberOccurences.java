import java.lang.reflect.Array;
import java.util.*;

/**
 * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
 *
 * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
 *
 * 示例 1：
 *
 * 输入：arr = [1,2,2,1,1,3]
 * 输出：true
 * 解释：在该数组中，1 出现了 3 次，2 出现了 2 次，3 只出现了 1 次。没有两个数的出现次数相同。
 * 示例 2：
 *
 * 输入：arr = [1,2]
 * 输出：false
 * 示例 3：
 *
 * 输入：arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * 输出：true
 */
public class UniqueNumberOccurences {
    /*
    拿一个set表示次数，排序arr，统计一个数字的出现次数，
    看看之前有没有，有的话直接返回false，否则下一个，直到结束返回true
     */
    public boolean uniqueOccurrences(int[] arr) {
        if (arr.length == 2) {
            if (arr[0] == arr[1])
                return true;
            return false;
        }
        Set<Integer> set = new HashSet<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int count = 1;
            while (i < arr.length - 1) {
                if (arr[i+1] == arr[i]) {
                    count++;
                    i++;
                }else break;
        }
            if (set.contains(count))
                return false;
            else set.add(count);
        }
        return true;
    }
}
