import java.io.*;
import java.util.*;

class FebCook3
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
		FastReader sc = new FastReader();
		int t, n, i, j, k, occ, ind_t, ind_p, max_occ;
		String s, sub, ans;
		t=sc.nextInt();
		while(t-->0)
		{
			n=sc.nextInt();
			s=sc.next();
			char[] text = s.toCharArray();
			Map<String, Integer> m = new TreeMap<String, Integer>();
			sub=""; max_occ=0;
			for(k=0; k<n; k++)
			{
				sub+=s.charAt(k);
				char[] arr = sub.toCharArray();
				int[] precompute = new int[arr.length];
				occ=0; precompute[0]=0; j=0; i=1;
				while(i<arr.length)
				{
					while(arr[i]!=arr[j])
					{
						if(j!=0)
							j=precompute[j-1];
						else
							break;
					}
					if(arr[i]!=arr[j])
					{
						precompute[i]=0;
						i++;
					}
					else
					{
						precompute[i]=j+1;
						i++;
						j++;
					}
				}
				ind_t=0; ind_p=0;
				while(ind_t<n)
				{
					while(ind_t<n && ind_p<arr.length && text[ind_t]==arr[ind_p])
					{
						ind_p++;
						ind_t++;
					}
					if(ind_p==arr.length)
					{
						occ++;
						ind_p=0;
					}
					if(ind_p!=0)
						ind_p=precompute[ind_p-1];
					else
						ind_p=0;
					ind_t++;
				}
				max_occ=Math.max(max_occ, occ);
				if(occ==0)
					break;
				m.put(sub, occ);
			}
			m.put(sub, 1); 
			ans="";
			for(Map.Entry<String, Integer> e : m.entrySet())
				if(e.getValue()==max_occ)
					ans=(e.getKey());
			System.out.println(ans);
		}
	}
}