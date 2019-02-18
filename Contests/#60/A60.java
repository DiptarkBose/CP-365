import java.io.*;
import java.util.*;

public class A60
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, max_streak, streak;
		long max=0;
		n=sc.nextInt();
		long[] arr = new long[n];
		for(i=0; i<n; i++)
		{
			arr[i]=sc.nextLong();
			max=Math.max(max, arr[i]);
		}
		streak=0; max_streak=0;
		for(i=0; i<n; i++)
		{
			if(arr[i]==max)
				streak++;
			else
			{
				max_streak=Math.max(max_streak, streak);
				streak=0;
			}
		}
		max_streak=Math.max(max_streak, streak);
		System.out.println(max_streak);
	}
}