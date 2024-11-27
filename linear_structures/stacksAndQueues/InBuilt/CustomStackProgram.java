package linear_structures.stacksAndQueues.InBuilt;

public class CustomStackProgram {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(4);
        stack.push(23);
        stack.push(234);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}




