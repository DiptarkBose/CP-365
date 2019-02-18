import java.io.*;
import java.util.*;

public class B60
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long m, k, max_h=0, count=0, m1=0, m2=0, m1_occ=0, g, r;
		int i, n;
		n=sc.nextInt(); m=sc.nextLong(); k=sc.nextLong();
		long[] arr = new long[n];
		for(i=0; i<n; i++)
		{
			arr[i]=sc.nextLong();
			m1=Math.max(m1, arr[i]);
		}
		for(i=0; i<n; i++)
		{
			if(arr[i]==m1)
				m1_occ++;
		}
		if(m1_occ>1)
			m2=m1;
		else
		{
			for(i=0; i<n; i++)
				if(arr[i]!=m1)
					m2=Math.max(m2, arr[i]);
		}
		g=m/(k+1);
		r=m-(g*(k+1));
		max_h=(g*k*m1)+(g*m2)+(r*m1);
		System.out.println(max_h);
	}
}