package Queue;

public class QueueImplTest {

    public static void main (String[] args) {

        Queue<Integer> q = new QueueImpl<Integer>(5);

        try {
            q.push(4);
            q.push(6);
            q.push(2);
            q.push(7);
            q.push(1);

        } catch (FullQueueException e) {
            e.printStackTrace();
        }

        try {

            System.out.println("Position 1 = " + q.pop());
            System.out.println("Position 2 = " + q.pop());
            System.out.println("Position 3 = " + q.pop());
            System.out.println("Position 4 = " + q.pop());
            System.out.println("Position 5 = " + q.pop());

        } catch (EmptyQueueException e) {
            e.printStackTrace();
        }

        System.out.println("Size = " + q.size());

    }
}
