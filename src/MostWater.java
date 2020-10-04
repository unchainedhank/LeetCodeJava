/**
 * 给你 n 个非负整数 a1，a2，...，an，
 * 每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，
 * 垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，
 * 使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * ┌─────┐
 * │     │
 * │     │
 * │     ├────────────────────────────┬─────┐
 * │     │                            │     │
 * │     │                            │     │
 * │     │                            │     │
 * │     │     ┌────┐                 │     │
 * │     │     │    │                 │     │
 * │     │     │    │      ┌────┐     │     │
 * │     │     │    │      │    │     │     │
 * │     │     │    │      │    │     │     │
 * │     │     │    │      │    │     │     │
 * │     │     │    │      │    │     │     │
 * │     │     │    │      │    │     │     │
 * │     │     │    │      │    │     │     │
 * │     │     │    │      │    │     │     │
 * └─────┴─────┴────┴──────┴────┴─────┴─────┘
 */
public class MostWater {
    public int  Solution(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1;i < j; ) {
            int minHeight = height[i] < height[j]? height[i++] : height[j++];
            int area = minHeight * (j - i + 1);
            max = Math.max(area,max);
        }
        return max;
    }
}
