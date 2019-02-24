import java.io.*;
import java.util.*;

class FebLunch1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long t, i, n, k, v, sum, z, elem;
		t=sc.nextLong();
		while(t-->0)
		{
			n=sc.nextLong(); k=sc.nextLong(); v=sc.nextLong(); sum=0; 
			Map<Long, Integer> m = new TreeMap<Long, Integer>();
			i=0;
			while(i<n)
			{
				elem=sc.nextLong();
				m.put(elem, 1);
				sum+=elem;
				i++;
			}
			z=(v*(n+k))-sum;
			if(z%k!=0 || z<=0)
				System.out.println("-1");
			else
				System.out.println(z/k);
		}
	}
}