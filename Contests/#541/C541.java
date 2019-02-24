import java.io.*;
import java.util.*;

public class C541
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, k=0;
		n=sc.nextInt();
		long[] arr = new long[n];
		long[] ans = new long[n];
		for(i=0; i<n; i++)
			arr[i]=sc.nextLong();
		Arrays.sort(arr);
		for(i=0; i<n; i+=2)
			ans[k++]=arr[i];
		if(n%2!=0)
		{
			for(i=n-2; i>=0 && k<n; i-=2)
				ans[k++]=arr[i];
		}
		else
		{
			for(i=n-1; i>=0 && k<n; i-=2)
				ans[k++]=arr[i];
		}
		for(i=0; i<n; i++)
			System.out.print(ans[i]+" ");
		System.out.println();
	}
}