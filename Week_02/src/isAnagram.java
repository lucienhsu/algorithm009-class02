/**
 * 有效的字母异位词：https://leetcode-cn.com/problems/valid-anagram/
 * <p>
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 */
public class isAnagram {

    /**
     * 题解方法
     * 1.排序对比
     * 2.
     * 3.
     */

    /**
     * 解题思路1：
     */
    public boolean solution(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(new isAnagram().solution("anagram", "nagaram"));
    }

}
