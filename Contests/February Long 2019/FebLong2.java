import java.io.*;
import java.util.*;

class FebLong2
{
	public static void main(String[] args) {
		int t, n, i, k, count;
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0)
		{
			n=sc.nextInt();
			k=n; count=0;
			String s;
			Set<Character> set;
			Map<Character, Integer> m = new TreeMap<Character, Integer>();
			while(n-->0)
			{
				s=sc.next();
				s+=sc.nextLine();
				set = new TreeSet<Character>();
				for(i=0; i<s.length(); i++)
					set.add(s.charAt(i));
				for(Character j: set)
				{
					if(!m.containsKey(j))
						m.put(j, 1);
					else
						m.put(j, m.get(j)+1);
				}
			}
			for(Map.Entry<Character, Integer> e: m.entrySet())
				if(e.getValue()==k)
					count++;
			System.out.println(count);
		}
	}
}