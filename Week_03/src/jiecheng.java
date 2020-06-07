/**
 * 阶乘
 * <p>
 * {题目描述}
 */
public class jiecheng {

    /**
     * 题解方法
     * 1. !n=1*2*3*3...*n  -> f(n)=n*f(n-1)
     * 2.
     * 3.
     */

    /**
     * 解题思路1：
     *
     * @param n
     */
    public int solution(int n) {
        if (n == 1) {
            return 1;
        }
        return n * (new jiecheng().solution(n - 1));
    }


    public static void main(String args[]) {
        System.out.println(new jiecheng().solution(4));
    }

}
