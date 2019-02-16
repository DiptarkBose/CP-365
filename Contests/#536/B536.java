import java.io.*;
import java.util.*;

public class B536
{
	public static void main(String[] args) {
		int n, m, t, d, i, pos;
		long cost;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		long[] a = new long[n];
		long[] c = new long[n];
		for(i=0; i<n; i++)
			a[i]=sc.nextLong();
		Map<Long, Vector<Integer>> map = new TreeMap<Long, Vector<Integer>>();
		for(i=0; i<n; i++)
		{
			c[i]=sc.nextLong();
			Vector<Integer> vct;
			if(!map.containsKey(c[i]))
				vct= new Vector<Integer>();
			else
				vct = map.get(c[i]);
			vct.add(i);
			map.put(c[i], vct);
		}
		Vector<Integer> cheap = new Vector<Integer>();
		for(Map.Entry<Long, Vector<Integer>> e: map.entrySet())
		{
			Vector<Integer> vct = e.getValue();
			for(Integer j: vct)
				cheap.add(j);
		}
		pos=0;
		while(m-->0)
		{
			t=sc.nextInt()-1;
			d=sc.nextInt();
			if(d<=a[t])
			{
				a[t]-=d;
				System.out.println(d*c[t]);
			}
			else
			{
				cost=0; d-=a[t]; cost+=(a[t]*c[t]); a[t]=0;
				while(d>0)
				{
					if(pos!=n)
					{
						i=cheap.get(pos);
						if(a[i]>d)
						{
							a[i]-=d;
							cost+=(d*c[i]);
							d=0;
						}
						else
						{
							pos++;
							cost+=(a[i]*c[i]);
							d-=a[i];
							a[i]=0;
						}
					}
					else
					{
						cost=0;
						break;
					}
				}
				System.out.println(cost);
			}
		}
	}
}