/**
 * 爬楼梯
 * <p>
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 * 示例 1：
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/climbing-stairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class climbStairs {

    /**
     * 解题思路：使用数学归纳方法，找最近重复子问题
     * 1=1
     * 2=2
     * 3=3
     * 4=f(3)+f(2)
     * ...
     * f(n)=f(n-1)+f(n-2)   第一次爬只能有两种选择1或2，故有n-1 或 n-2
     * 最后得出模型，这就是一个斐不拉契
     *
     * @param n
     */
    public int climbStairs(int n) {
        // 初始化一个 n+1 数组，a[1]=1, a[2]=2, a[n]=a[n-1]+[n-2]

        int[] a = new int[n + 1];
        a[1] = 1;
        a[2] = 2;
        if (n <= 2) {
            return a[n];
        }

        for (int i = 3; i < a.length; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }

        return a[n];
    }


    public static void main(String args[]) {
        int n = 8;
        System.out.println(new climbStairs().climbStairs(4));
    }

}
