import java.util.HashSet;
import java.util.Set;

/**
 * 环形链表：https://leetcode-cn.com/problems/linked-list-cycle/
 * <p>
 * 给定一个链表，判断链表中是否有环。
 */
public class hasCycle {

    /**
     * 题解方法
     * 1. 暴力循环放入 set 中，发现存在即为环形链表
     * 2. 双指针快慢指针：即定义两个不同指向速度的指针，一个行进速度较慢，一个较快，快的指针如果追上慢的指针那么即为环形链表
     */


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * 解题思路1：暴力循环放入 set 中，发现存在即为环形链表
     *
     * @param head
     */
    public boolean solution1(ListNode head) {
        Set<ListNode> res = new HashSet<>();
        while (head != null) {
            if (res.contains(head)) {
                return true;
            } else {
                res.add(head.next);
            }
            head = head.next;
        }

        return false;
    }

    /**
     * 解题思路2
     *
     * @param head
     */
    public boolean solution2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode quick = head.next;
        while (slow != quick) {
            if (slow == null || quick == null) {
                return false;
            }
            slow = slow.next;
            quick = quick.next.next;
        }
        return true;
    }


    public static void main(String args[]) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = c;

        System.out.println(new hasCycle().solution1(a));
    }

}
