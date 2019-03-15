import java.io.*;
import java.util.*;

public class C542
{
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
    static boolean[][] visited;
	public static void dfs(int x, int y, Vector<Integer[]> bucket, int[][] mat, int n)
	{
		if(visited[x][y])
			return;
		Integer[] arr ={x, y};
		bucket.add(arr);
		visited[x][y]=true;
		if(y+1<n && !visited[x][y+1] && mat[x][y+1]==0)
			dfs(x, y+1, bucket, mat, n);
		if(y-1>=0 && !visited[x][y-1] && mat[x][y-1]==0)
			dfs(x, y-1, bucket, mat, n);
		if(x+1<n && !visited[x+1][y] && mat[x+1][y]==0)
			dfs(x+1, y, bucket, mat, n);
		if(x-1>=0 && !visited[x-1][y] && mat[x-1][y]==0)
			dfs(x-1, y, bucket, mat, n);
	}
	public static void main(String[] args) {
		int n, r1, c1, r2, c2, i, j, min_dist=Integer.MAX_VALUE, dist;
		String s;
		FastReader sc = new FastReader();
		n=sc.nextInt();
		visited = new boolean[n][n];
		r1=sc.nextInt()-1; c1=sc.nextInt()-1;
		r2=sc.nextInt()-1; c2=sc.nextInt()-1; 
		int[][] mat = new int[n][n];
		for(i=0; i<n; i++)
		{
			s=sc.next();
			for(j=0; j<n; j++)
				mat[i][j]=s.charAt(j)-'0';
		}
		Vector<Integer[]> bucket1 = new Vector<Integer[]>();
		Vector<Integer[]> bucket2 = new Vector<Integer[]>();
		dfs(r1, c1, bucket1, mat, n);
		dfs(r2, c2, bucket2, mat, n);
		if(bucket2.size()==0)
			min_dist=0;
		else
		{
			for(Integer[] a : bucket1)
			{
				for(Integer[] b : bucket2)
				{
					dist=(int)Math.pow((a[0]-b[0]), 2) + (int)Math.pow((a[1]-b[1]), 2);
					min_dist=Math.min(min_dist, dist);
				}
			}
		}
		System.out.println(min_dist);
	}
}