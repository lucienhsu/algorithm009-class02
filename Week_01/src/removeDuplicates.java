import java.util.Arrays;

/**
 * 删除排序数组中的重复项：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * <p>
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */
public class removeDuplicates {

    /**
     * 题解方法
     * 1.
     * 2.
     * 3.
     */

    /**
     * 解题思路1：
     *
     * @param nums
     */
    public int solution1(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }


    public static void main(String args[]) {
        int[] a = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        new removeDuplicates().solution1(a);
        System.out.println(Arrays.toString(a));
    }

}
