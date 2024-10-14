import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class Graph{
    private Map<Integer, List<Integer>> adjList;
    public Graph(){
        adjList = new HashMap<>();
    }
    public void addEdge(int u,int v){
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u);  //for Undirected Graph
    }
    public void dfs(int start){
        Set<Integer> visited = new HashSet<>();
        System.out.print("DFS Using Recursive Method : ");
        dfsHelper(start,visited);
        System.out.println();
        System.out.print("DFS Using Iterative Method : ");
        dfsHelper(start);
        System.out.println();
    }
    private void dfsHelper(int start){         //Using Iterative Method
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stk = new Stack<>();
        stk.push(start);

        while (!stk.isEmpty()) {
            int vertex = stk.pop();
            if(!visited.contains(vertex)){
                System.out.print(vertex + " ");
                visited.add(vertex);
            }
            for (int neighbour : adjList.getOrDefault(vertex, new ArrayList<>())) {
                if(!visited.contains(neighbour)){
                    stk.push(neighbour);
                }
            }
        }
    }
    private void dfsHelper(int vertex,Set<Integer> visited){   // Using Recursion
        visited.add(vertex);
        System.out.print(vertex+" ");
        for (int neighbour : adjList.getOrDefault(vertex, new ArrayList<>())) {
            if(!visited.contains(neighbour)){
                dfsHelper(neighbour, visited);
            }
        }
    }
    public void bfs(int start){
        System.out.print("BFS : ");
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        visited.add(start);
        queue.add(start);
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex+" ");
            for (int neighbour : adjList.getOrDefault(vertex, new ArrayList<>())) {
                if(!visited.contains(neighbour)){
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }
    }
}
public class A_85 {
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(1, 5);
        g.addEdge(2, 6);
        g.addEdge(3, 6);
        g.addEdge(4, 7);
        g.addEdge(5, 7);
        g.addEdge(6, 8);
        g.addEdge(7, 8);

        

        g.dfs(1);
        g.bfs(1);
    }
}