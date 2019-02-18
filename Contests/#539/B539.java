import java.io.*;
import java.util.*;

public class B539
{
	public static void main(String[] args) {
		int n, i, j, k, pos, count;
		long sum;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int[] arr = new int[n];
		for(i=0; i<n; i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		i=0; j=n-1;
		while(j>i)
		{
			Vector<Integer> factors = new Vector<Integer>();
			sum=arr[i]+arr[j];
			for(k=1; k<=Math.sqrt(arr[j]); k++)
			{
				if(arr[j]%k==0)
				{
					factors.add(k);
					if((arr[j]/k)!=k)
						factors.add(arr[j]/k);
				}
			}
			Collections.sort(factors);
			pos=-1; count=0;
			for(Integer z: factors)
			{
				if((arr[i]*z)+(arr[j]/z)<sum)
				{
					sum=(arr[i]*z)+(arr[j]/z);
					pos=count;
				}
				count++;
			}
			if(pos!=-1)
			{
				count=factors.get(pos);
				arr[i]*=count;
				arr[j]/=count;
				if(arr[i]>arr[i+1])
					i++;
			}
			j--;
		}
		sum=0;
		for(i=0; i<n; i++)
			sum+=arr[i];
		System.out.println(sum);
	}
}