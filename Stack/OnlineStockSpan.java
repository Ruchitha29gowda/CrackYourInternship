package Stack;

public class OnlineStockSpan {
    
}

class StockSpanner {
    Stack<int[]> st ;

    public StockSpanner() {
        st = new Stack<>();
    }

    //int[] with length 2; 1-> price & 2->span
    
    public int next(int price) {
        int s = 1;
        while(!st.isEmpty() && price>=st.peek()[0]){
            s+=st.pop()[1];
        }

        st.add(new int[] {price , s});
        return s;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */