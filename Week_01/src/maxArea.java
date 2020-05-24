/**
 * 盛最多水的容器
 * <p>
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * 示例：
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 */
public class maxArea {

    /**
     * 解题思路：
     * 1.枚举所有的面积，获取最大值
     *
     * @param nums
     */
    public int maxArea(int[] nums) {
        int maxVal = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int area = (j - i) * Math.min(nums[i], nums[j]);
                maxVal = Math.max(area, maxVal);
            }
        }
        return maxVal;
    }

    /**
     * 解题思路：
     * 1.左右边界中间收敛
     *
     * @param a
     */
    public int maxArea1(int[] a) {
        int maxArea = 0;
        for (int i = 0, j = a.length - 1; i < j; ) {
            int minHeight = a[i] < a[j] ? a[i++] : a[j--];
            int area = (j - i + 1) * minHeight;  // 因为上面一句，i/j 发生了变化，所以需要补1
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }


    public static void main(String args[]) {
        int[] nums = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(new maxArea().maxArea1(nums));
    }

}
