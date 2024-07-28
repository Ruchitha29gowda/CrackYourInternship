package search;


public class ReverseSubArraySort {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3};
        System.out.println(check(arr));
    }

    public static boolean check(int[] arr){
        int x=-1, y=-1;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1] ){
                if(x==-1)x=i;
                y=i+1;
            }
        }

        System.out.println(x+" "+y);
        while(x<y){
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
            x++;
            y--;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
