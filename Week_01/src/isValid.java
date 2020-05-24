/**
 * 有效的括号：https://leetcode-cn.com/problems/valid-parentheses/
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * 示例 1:
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * 输入: "{[]}"
 * 输出: true
 */
public class isValid {

    /**
     * 题解方法
     * 1. 暴力破解：替换()/{}/[]，直至最后字符串为空；
     * 2. 用deque或者 stack，取头和尾组合
     * 3. 用 stack，所有（{[都入栈，遇到)}]就pop 进行比较；
     */

    /**
     * 解题思路1：
     *
     * @param s
     */
    public boolean solution(String s) {
        return true;
    }

    public static void main(String args[]) {
        int n = 8;
        System.out.println(new isValid().solution(""));
    }

}
