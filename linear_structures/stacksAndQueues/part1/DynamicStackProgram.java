package linear_structures.stacksAndQueues.part1;

public class DynamicStackProgram {
    public static void main(String[] args) throws Exception {
        DynamicStack stack = new DynamicStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(4);
        stack.push(23);
        stack.push(234);
        stack.push(23);
        stack.push(23);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
