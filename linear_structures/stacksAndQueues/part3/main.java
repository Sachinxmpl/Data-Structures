package linear_structures.stacksAndQueues.part3;

public class main {
    public static void main(String[] args) throws Exception {
        

        //Custom queue part 
        CustomQueue queue = new CustomQueue(10);
        System.out.println(queue.insert(40));
        System.out.println(queue.insert(30));
        System.out.println(queue.insert(33));
        System.out.println(queue.remove());
    }
}
