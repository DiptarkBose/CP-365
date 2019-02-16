import java.io.*;
import java.util.*;

class FebLong5
{
	public static void main(String[] args) {
		int t, i, n, cost, distinct, bin, steps;;
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		String s;
		while(t-->0)
		{
			s=sc.next();
			s+=sc.nextLine();
			Map<Character, Integer> m = new TreeMap<Character, Integer>();
			for(i=0; i<s.length(); i++)
			{
				if(!m.containsKey(s.charAt(i)))
					m.put(s.charAt(i), 1);
				else
					m.put(s.charAt(i), m.get(s.charAt(i))+1);
			}
			int[] arr = new int[m.size()];
			i=0; cost=100000000;
			for(Map.Entry<Character, Integer> e: m.entrySet())
				arr[i++] = e.getValue();

			Arrays.sort(arr);
			Set<Integer> factors = new TreeSet<Integer>();
			n=s.length();
			for(i=1; i<=Math.sqrt(n); i++)
			{
				if(n%i==0)
				{
					factors.add(n/i);
					factors.add(i);
				}
			}

			for(Integer j: factors)
			{
				distinct=n/j; bin=0; steps=0;
				for(i=0; i<m.size(); i++)
					if(j-arr[i]<0)
						bin+=(arr[i]-j);
				if(distinct>m.size())
				{
					if(distinct<=26)
						cost=Math.min(cost, bin);
				}
				else
				{
					for(i=0; i<m.size()-distinct; i++)
						bin+=(j-arr[i]);
					for(i=m.size()-distinct; i<m.size(); i++)
					{
						if(j-arr[i]==0 || j-arr[i]<0)
							break;
						else
						{
							bin-=(j-arr[i]);
							steps+=(j-arr[i]);
						}
					}
					cost=Math.min(cost, steps);
				}
			}
			System.out.println(cost);
		}
	}
}