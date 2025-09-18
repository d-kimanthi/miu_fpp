package lab7.problem3;

import java.util.Stack;

public class BrowserHistory {
    Stack<String> backward;
    Stack<String> forward;

    BrowserHistory(String url){
        backward = new Stack<>();
        forward = new Stack<>();
        backward.push(url);
    }

    public void visit(String url){
        backward.push(url);
        System.out.println("Visited: " + url);
    }

    public void back(){
        if(backward.size() == 1) System.out.println("No history to go back to");
        else{
            String url = backward.pop();
            forward.push(url);
            System.out.println("Back to: " + backward.peek());
        }
    }

    public void forward(){
        if(forward.isEmpty()) System.out.println("No forward history");
        else{
            String url = forward.pop();
            backward.push(url);
            System.out.println("Forward to: " + url);
        }
    }

}
