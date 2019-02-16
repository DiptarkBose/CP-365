import java.io.*;
import java.util.*;

public class C536
{
	public static void main(String[] args) {
		int n, i, s;
		long total=0;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int[] arr = new int[n];
		for(i=0; i<n; i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		for(i=0; i<(n/2); i++)
		{
			s=arr[i]+arr[n-i-1];
			total+=(s*s);
		}
		System.out.println(total);
	}
}