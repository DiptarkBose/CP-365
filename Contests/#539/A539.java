import java.io.*;
import java.util.*;

public class A539
{
	public static void main(String[] args) {
		int n, v, need, m, i, carry, x;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt(); v=sc.nextInt();
		m=0; carry=0; need=n-1;
		for(i=1; i<n; i++)
		{
			x=v-carry;
			if(x>=need)
			{
				m+=(need*i);
				carry+=need;
				need=0;
				break;
			}
			else
			{
				m+=(x*i);
				carry+=x;
				need-=x;
			}
			carry--;
		}
		System.out.println(m);
	}
}