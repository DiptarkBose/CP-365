import java.io.*;
import java.util.*;

class FebLong4
{
	public static void main(String[] args) {
		int t, n, i;
		long sum;
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0)
		{
			n=sc.nextInt();
			sum=0;
			for(i=0; i<n; i++)
				sum+=sc.nextLong();
			System.out.println(sum-n+1);
		}
	}
}