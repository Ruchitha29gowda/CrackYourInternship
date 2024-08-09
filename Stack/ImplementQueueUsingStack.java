package Stack;

public class ImplementQueueUsingStack {
    
}

class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        while(!st1.isEmpty()){
            int val = st1.pop();
            st2.push(val);
        }

        int val = st2.pop();
        while(!st2.isEmpty()){
            int v = st2.pop();
            st1.push(v);
        }

        return val;
    }
    
    public int peek() {
        while(!st1.isEmpty()){
            int val = st1.pop();
            st2.push(val);
        }

        int val = st2.peek();
        while(!st2.isEmpty()){
            int v = st2.pop();
            st1.push(v);
        }

        return val;

    }
    
    public boolean empty() {
        if(st1.isEmpty()) return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */