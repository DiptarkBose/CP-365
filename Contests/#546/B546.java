import java.io.*;
import java.util.*;

public class B546
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n, k, forward, backward, cost;
		n=sc.nextLong(); k=sc.nextLong();
		if(k==1)
		{
			cost=4;
			k=2;
			forward=(3*(n-k))+2;
			cost+=forward;
		}
		else
		{
			if(k>n/2)
			{
				forward=(4*(n-k))+2;
				backward=4;
				k-=2;
				if(k>0)
					backward+=(3*k);
			}	
			else
			{
				backward=(4*k)-2;
				forward=4;
				k+=2;
				if(k<=n)
					forward+=3*(n-k+1);
			}
			cost=forward+backward;
		}
		System.out.println(cost);
	}
}