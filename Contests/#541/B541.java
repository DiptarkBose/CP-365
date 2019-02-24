import java.io.*;
import java.util.*;

public class B541
{
	public static void main(String[] args) {
		int n, i;
		long count=0, j;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		long[][] arr = new long[n+1][2];
		arr[0][0]=0; arr[0][1]=0;
		for(i=1; i<n+1; i++)
		{
			arr[i][0]=sc.nextLong();
			arr[i][1]=sc.nextLong();
		}
		for(i=1; i<n+1; i++)
		{
			if(arr[i][0]==arr[i-1][0] && arr[i][1]==arr[i-1][1])
				continue;
			if(arr[i-1][1]>arr[i][0] || arr[i][1]<arr[i-1][0])
				continue;
			Map<Long, Integer> m = new TreeMap<Long, Integer>();
			j=arr[i-1][0];
			while(j<=arr[i][0])
			{
				m.put(j, 1);
				j++;
			}
			j=arr[i-1][1];
			while(j<=arr[i][1])
			{
				if(m.containsKey(j))
					count++;
				j++;
			}	
		}
		if(count==0)
			count++;
		System.out.println(count);
	}
}