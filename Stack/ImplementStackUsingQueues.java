package Stack;

public class ImplementStackUsingQueues {
    
}
class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        while(q1.size()!=1){
            int v = q1.remove();
            q2.add(v);
        }
        int val = q1.remove();
        while(!q2.isEmpty()){
            int v = q2.remove();
            q1.add(v);
        }

        return val;
    }

    
    public int top() {
        while(q1.size()!=1){
            int v = q1.remove();
            q2.add(v);
        }
        int val = q1.remove();
        System.out.println(val);
        q2.add(val);
        while(!q2.isEmpty()){
            int v = q2.remove();
            q1.add(v);
        }
        
        return val;
    }
    
    public boolean empty() {
        if(q1.isEmpty()) return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */