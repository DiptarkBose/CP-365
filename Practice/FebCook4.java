import java.io.*;
import java.util.*;

class FebCook4
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
	public static void main(String[] args) {
		int t, n, k, l, r, i, count, min, sum, exp;
		FastReader sc = new FastReader();
		t=sc.nextInt();
		while(t-->0)
		{
			n=sc.nextInt(); k=sc.nextInt();
			int[][] rec = new int[n][2];
			int[] arr = new int[100002];
			int[] heights = new int[100002];
			int[] k_count = new int[100002];
			int[] kplus1_count = new int[100002];
			for(i=0; i<n; i++)
			{
				rec[i][0]=sc.nextInt();
				rec[i][1]=sc.nextInt();
				arr[rec[i][0]]++;
				arr[rec[i][1]+1]--;
			}
			count=0; sum=0; min=1000000000;
			for(i=1; i<=100000; i++)
			{
				sum+=arr[i];
				heights[i]=sum;
				if(heights[i]==k)
					count++;
				k_count[i]=k_count[i-1];
				if(heights[i]==k)
					k_count[i]++;
				kplus1_count[i]=kplus1_count[i-1];
				if(heights[i]==(k+1))
					kplus1_count[i]++;
			}
			for(i=0; i<n; i++)
			{
				exp=k_count[rec[i][1]]-k_count[rec[i][0]];
				if(heights[rec[i][0]]==k)
					exp++;
				exp-=kplus1_count[rec[i][1]]-kplus1_count[rec[i][0]];
				if(heights[rec[i][0]]==(k+1))
					exp--;
				min=Math.min(min, exp);
			}
			System.out.println(count-min);
		}
	}
}