import java.io.*;
import java.util.*;

class FebLong1
{
	public static long gcd(long a, long b)
	{
		while(a!=b)
		{
			if(a>b)
				a-=b;
			else
				b-=a;
		}
		return a;
	}
	public static void main(String[] args) {
		long t, n, a, b, k, l, ca, cb, cab, ans;
		Scanner sc = new Scanner(System.in);
		t=sc.nextLong();
		while(t-->0)
		{
			n=sc.nextLong(); a=sc.nextLong(); b=sc.nextLong(); k=sc.nextLong();
			l=(a*b)/gcd(a, b);
			ca = n/a;
			cb = n/b;
			cab = n/l;
			ans=ca+cb-(2*cab);
			if(ans>=k)
				System.out.println("Win");
			else
				System.out.println("Lose");
		}
	}
}