import java.util.*;

public class CollectionsQueue {
    public static void main(String[] args) {

        Deque<Integer>deque =new ArrayDeque<>();
        PriorityQueue<String>pq = new PriorityQueue<>();

        pq.add("John");
        pq.add("Micheal");
        pq.add("Carol");
        System.out.println(pq.remove());
        System.out.println(pq.remove());


    }
}
