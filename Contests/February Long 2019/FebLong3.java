import java.io.*;
import java.util.*;

class FebLong3
{
	public static void main(String[] args) {
		int t, n, i, max;
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0)
		{
			n=sc.nextInt();
			int[] a = new int[n];
			int[] d = new int[n];
			for(i=0; i<n; i++)
				a[i]=sc.nextInt();
			for(i=0; i<n; i++)
				d[i]=sc.nextInt();
			max=-1;
			if(a[1]+a[n-1]<d[0])
				max=Math.max(max, d[0]);
			if(a[0]+a[n-2]<d[n-1])
				max=Math.max(max, d[n-1]);
			for(i=1; i<=n-2; i++)
				if(a[i-1]+a[i+1]<d[i])
					max=Math.max(max, d[i]);
			System.out.println(max);
		}
	}
}