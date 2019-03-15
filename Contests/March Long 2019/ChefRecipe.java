import java.io.*;
import java.util.*;

class ChefRecipe
{
	public static void main(String[] args) {
		int t, n, num, i, k, count, j;
		String s;
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0)
		{
			n=sc.nextInt();
			Map<Integer, Integer> m = new TreeMap<Integer, Integer>();
			while(n-->0)
			{
				s=sc.next();
				Set<Character> char_set = new TreeSet<Character>();
				num=0;
				for(i=0; i<s.length(); i++)
					char_set.add(s.charAt(i));
				for(Character c : char_set)
				{
					if(c=='a')
						num+=16;
					else if(c=='e')
						num+=8;
					else if(c=='i')
						num+=4;
					else if(c=='o')
						num+=2;
					else
						num+=1;
				}
				if(m.containsKey(num))
					m.put(num, m.get(num)+1);
				else
					m.put(num, 1);
			}
			k=0; count=0;
			int[] arr = new int[m.size()];
			for(Map.Entry<Integer, Integer> e: m.entrySet())
				arr[k++]=e.getKey();
			for(i=0; i<k; i++)
			{
				for(j=0; j<=31; j++)
				{
					if((arr[i]|j)==31)
					{
						if(arr[i]!=j)
							if(m.containsKey(j))
								count+=(m.get(arr[i])*m.get(j));
						else
							if(m.containsKey(j))
								count+=(m.get(j)*(m.get(j)-1))/2;
						
						m.remove(j);
					}
				}
				m.remove(arr[i]);
			}
			System.out.println(count);
		}
	}
}