import java.io.*;
import java.util.*;

public class C538
{
	public static void main(String[] args) {
		long n, b, i, p, q, count=0, r, x, y;
		Scanner sc = new Scanner(System.in);
		n=sc.nextLong(); b=sc.nextLong();
		Map<Long, Long> m = new TreeMap<Long, Long>();	
		while(n>0)
		{
			r=n;
			while(r%2==0)
			{
				r=r/2;
				if(!m.containsKey(2l))
					m.put(2l, 1l);
				else
					m.put(2l, m.get(2l)+1);
			}
			i=3;
			while(i<=Math.sqrt(r))
			{
				while(r%i==0)
				{
					r=r/i;
					if(!m.containsKey(i))
						m.put(i, 1l);
					else
						m.put(i, m.get(i)+1);
				}
				i+=2;
			}
			if(r>2)
			{
				if(!m.containsKey(r))
					m.put(r, 1l);
				else
					m.put(r, m.get(r)+1);
			}
			n--;
		}
		m.put(1l, 1l);
		Vector<Long> factors = new Vector<Long>();
		i=1;
		while(i<=Math.sqrt(b))
		{
			if(b%i==0)
			{
				if(b/i==i)
					factors.add(i);
				else
				{
					factors.add(i);
					factors.add(b/i);
				}
			}
			i++;
		}
		factors.remove(1l);
		System.out.println(factors+"\n"+m);
		int j=0, ind;
		while(j<factors.size())
		{
			if(factors.get(j)!=-1)
			{
				x=factors.get(j); y=b/x;
				System.out.println("YO "+ x);
				if(m.containsKey(x) && m.containsKey(y))
				{
					p=m.get(x); 
					q=m.get(y);
					if(x==y)
						count+=(Math.min(p, q)/2);
					else
						count+=Math.min(p, q);
					if(factors.contains(y))
					{
						ind=factors.indexOf(y);
						factors.set(ind, -1l);
					}
					factors.set(j, -1l);
				}
			}
			j++;
		}
		System.out.println(count);
	}
}