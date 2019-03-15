import java.io.*;
import java.util.*;

class SubbuBC
{
	static int[] count_store;
	public static int dfs(int u, boolean[] visited, int n, LinkedList[] adj)
	{
		visited[u]=true;
		int node_count=0, sum=0;
		Iterator<Integer> i = adj[u].listIterator(); 
        while (i.hasNext()) 
		{
			int k=i.next();
			if(!visited[k])
			{
				sum+=dfs(k, visited, n, adj);
				node_count++;
			}
		}
		if(node_count==0)
		{
			count_store[u]=1;
			return 1;
		}
		else
		{
			count_store[u]=sum;
			return sum;
		}
	}
	public static void main(String[] args) {
		int n, i, dummy, u, v;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		count_store=new int[n];
		LinkedList<Integer>[] adj;
		adj=new LinkedList[n];
		for(i=0; i<n; i++)
			adj[i]= new LinkedList<Integer>();
		for(i=0; i<n-1; i++)
		{
			u=sc.nextInt()-1; v=sc.nextInt()-1;
			adj[u].addFirst(v);
			adj[v].addFirst(u);
		}
		boolean[] visited = new boolean[n];
		dummy=dfs(0, visited, n, adj);
		for(i=0; i<n; i++)
			System.out.print(count_store[i]+" ");
		System.out.println();
	}
}