import java.util.*;

public class queue{
    public static void main(String[] args){
        // Deque --> Double Ended queue
        Deque<String> waitingLine = new LinkedList<>();
        Stack<String> stackA = new Stack<>();
        List<String> people = new ArrayList<String>(Arrays.asList("Rajeev", "Chris", "John"));

        for(String person : people){
            waitingLine.addFirst(person);
            stackA.push(person);
        }

        // System.out.println(waitingLine.size());


        System.out.println("People join the Queue and Stack:" + people.toString() + " \n\nPerson dequeue from queue:");
        while(!waitingLine.isEmpty()){
            System.out.println(waitingLine.removeLast());
        }

        System.out.println("\nPerson pop from stack:");
        while(!stackA.isEmpty()){
            System.out.println(stackA.pop());
        }
    }
}
