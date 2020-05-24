import java.util.Arrays;

/**
 * 旋转数组：https://leetcode-cn.com/problems/rotate-array/
 * <p>
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 */
public class rotate {

    /**
     * 题解方法
     * 1. 暴力
     * 2. 新建一个数组
     * 3. 反转3次
     */

    /**
     * 解题思路1：暴力反转 k 次
     *
     * @param nums
     * @param k
     */
    public void solution1(int[] nums, int k) {
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                // 被挤出来的值放到变量中，下一轮用于赋值
                previous = temp;
            }
        }
    }


    public static void main(String args[]) {
        int[] a = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        new rotate().solution1(a, 3);
        System.out.println(Arrays.toString(a));
    }

}
