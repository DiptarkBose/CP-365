import java.io.*;
import java.util.*;

public class B537
{
	public static void main(String[] args) {
		int n, k, m, i, r, j;
		double avg=0, p=0, q=0, max=0;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt(); k=sc.nextInt(); m=sc.nextInt();
		double[] arr = new double[n];
		double[] precompute = new double[n];
		for(i=0; i<n; i++)
			arr[i]=sc.nextDouble();
		Arrays.sort(arr);
		for(i=0; i<n; i++)
		{
			if(i==0)
				precompute[i]=arr[i];
			else
				precompute[i]=precompute[i-1]+arr[i];
		}
		int[] recharge = new int[n];
		Arrays.fill(recharge, k);
		j=n-1;
		avg=precompute[n-1]/(double)n; r=0;
		for(i=0; i<m; i++)
		{
			if(n-r>=2)
			{
				p=avg*(n-r);
				p=(p-precompute[r])/(double)(n-r-1);

				if(recharge[j]>0 && j!=r)
				{
					q=avg*(n-r);
					q=(q+1)/(double)(n-r);
					if(q>p)
					{
						recharge[j]--;
						if(recharge[j]==0)
							j--;
						avg=q;
					}
					else
					{
						avg=p;
						r++;
					}
				}
				else
				{
					avg=p;
					r++;
				}
				System.out.println(p+" "+q);
			}
			else
			{
				q=avg*(n-r);
				System.out.println(q+"----");
				q=(q+1)/(double)(n-r);
				avg=q;
				if(recharge[j]==0)
					j--;
			}
			max=Math.max(max, avg);
		}
		System.out.println(max);
	}
}