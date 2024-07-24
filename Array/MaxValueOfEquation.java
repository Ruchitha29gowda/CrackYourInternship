public class MaxValueOfEquation {
    
}

class Solution {
    public static class Point implements Comparable<Point>{
        int diff;
        int x;
        Point(int diff, int x){
            this.diff = diff;
            this.x = x;
        }

        @Override
        public int compareTo(Point p1){
            if(p1.diff!=this.diff){
                return p1.diff - this.diff;
            }
            else{
                return p1.x - this.x;
            }
        }
    }
    public int findMaxValueOfEquation(int[][] points, int k) {
        int max = Integer.MIN_VALUE;
        PriorityQueue<Point> pq = new PriorityQueue<>();
        pq.add(new Point(points[0][1]-points[0][0], points[0][0]));
        for(int i=1; i<points.length; i++){
            while(!pq.isEmpty() && Math.abs(pq.peek().x - points[i][0])>k){
                System.out.println(pq.peek().diff+"  "+ pq.remove().x);
            }
            if(!pq.isEmpty()){
                int ans = pq.peek().diff + points[i][0] + points[i][1];
                max = Math.max(ans, max);
            }
            pq.add(new Point(points[i][1]-points[i][0], points[i][0]));
        }
        return max;

    }
}