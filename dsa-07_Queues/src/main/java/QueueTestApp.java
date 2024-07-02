public class QueueTestApp {

    public static void main(String[] args) {

        MyQueue<Integer> mq = new MyQueue<>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        System.out.println("Size of queue is : " + mq.size);
        System.out.println("Front is : " + mq.peek());
        System.out.println("First remove from queue : " + mq.dequeue());



    }
}
