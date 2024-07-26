package LinkedList;



public class SortOnesTwosZeros {
    public static class Node{
        int val;
        Node next;
    
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    
    public static Node head;

    public static void printLL(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.val+"  ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void sort(){
        int[] freq = new int[3];

        Node temp = head;
        while (temp!=null) {
            if(temp.val==0) freq[0]+=1;
            else if(temp.val==1) freq[1]+=1;
            if(temp.val==2) freq[2]+=1;
            temp=temp.next;
        }
        temp = head;

        for(int i=0; i<freq.length; i++){
            // System.out.print(freq[i]+"  ");
            while (freq[i]>0) {
                temp.val = i;
                temp=temp.next;
                freq[i]-=1;
            }
        }
        System.out.println();
        printLL();

    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(0);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next = new Node(1);

        printLL();
        sort();
    }
}
