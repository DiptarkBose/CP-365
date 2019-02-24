import java.io.*;
import java.util.*;

class FebLunch2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long t, d1, d2, profit, z, count, a;
		t=sc.nextLong();
		while(t-->0)
		{
			a=sc.nextLong();
			profit=0; z=1; d1=0; count=0; d2=0;
			do
			{
				if(a<=z && count==0)
				{
					d2=d1;
					count=1;
				}
				profit+=(a-z);
				z*=2;
				d1++;
			}while(profit>0);
			d1--; 
			System.out.println(d1+" "+d2);
		}
	}
}