import java.util.Deque;
import java.util.LinkedList;

/**
 * 用 add first 或 add last 这套新的 API 改写 Deque 的代码
 */
public class newApi4Queue {
    /**
     * @return
     */
    public void solution() {
        Deque<String> deque = new LinkedList<>();

        deque.addLast("a");
        deque.addLast("b");
        deque.addLast("c");
        System.out.println(deque);

        String str = deque.getFirst();
        System.out.println(str);
        System.out.println(deque);

        while (deque.size()>0){
            System.out.println(deque.removeFirst());
        }
        System.out.println(deque);
    }


    public static void main(String args[]) {
        new newApi4Queue().solution();
    }

}
