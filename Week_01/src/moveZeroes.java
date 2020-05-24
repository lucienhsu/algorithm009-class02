import java.util.Arrays;

/**
 * 移动0
 * <p>
 * 题目描述：
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 示例:
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/move-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class moveZeroes {

    /**
     * <p>
     * 解题思路：
     * 1.定义一个下标 j，该下标始终记录非0元素的位置
     * 2.循环数组，若nums[i] != 0，则 nums[j]=nums[i]，并且 j++
     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        if (nums.length <= 1) return;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                // i 和 j 不等后则说明发现0元素，非0前移后需要把0往后移，否则数组会变形
                // 另外一个思路就是，先交换，然后在开另外的循环把从后面开始把数据修改为0，见 moveZeroes1()
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
    }


    public void moveZeroes1(int[] nums) {
        if (nums.length <= 1) return;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        for (int i = j; i < nums.length; i++) {
            nums[j] = 0;
        }
    }


    public static void main(String args[]) {
//        int[] nums = new int[]{0, 1, 0, 3, 12};
//        int[] nums = new int[]{1, 2, 3, 4, 5};
//        int[] nums = new int[]{1};
        int[] nums = new int[]{1, 2, 3, 0, 5};
//        new moveZeroes().moveZeroes(nums);
        new moveZeroes().moveZeroes1(nums);
        System.out.println(Arrays.toString(nums));
    }

}
