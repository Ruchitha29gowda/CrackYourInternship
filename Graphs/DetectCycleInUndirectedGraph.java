package Graphs;

import java.util.ArrayList;

public class DetectCycleInUndirectedGraph {
    
}

class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] vis = new boolean[V];
        for(int i=0; i<adj.size(); i++){
            if(!vis[i]){
                if(isCycleUtil(adj,vis, i, -1)){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean isCycleUtil(ArrayList<ArrayList<Integer>> adj,boolean[] vis,int curr, int par) {
        
        // Code here
        vis[curr]=true;
        ArrayList<Integer> arr = adj.get(curr);
        
        for(int i=0; i<arr.size(); i++){
            
            if(vis[arr.get(i)]){
                
                if(par != arr.get(i)){
                    return true;
                }
            }
            
            else if(!vis[arr.get(i)]){
                if(isCycleUtil(adj,vis, arr.get(i), curr)){
                    return true;
                }
            }
        }
        
        return false;
    }
}
