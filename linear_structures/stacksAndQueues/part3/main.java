package linear_structures.stacksAndQueues.part3;

public class main {
    public static void main(String[] args) throws Exception {
        

        //Custom queue part 
        CustomQueue queue = new CustomQueue(10);
        System.out.println(queue.insert(40));
        System.out.println(queue.insert(30));
        System.out.println(queue.insert(33));
        System.out.println(queue.remove());



        //circular queue
        CircularQueue cq = new CircularQueue() ;
        cq.insert(10);
        cq.insert(20);
        cq.insert(40);
        cq.insert(50);
        cq.insert(60);
        cq.display();
        System.out.println();

        cq.remove();
        cq.remove();
        cq.insert(100);
        cq.display();
    }
}
