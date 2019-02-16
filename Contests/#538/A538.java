import java.io.*;
import java.util.*;

public class A538
{
	public static void main(String[] args) {
		int x, y, z, a, b, c, total, flag=0;
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt(); y=sc.nextInt(); z=sc.nextInt();
		a=sc.nextInt(); b=sc.nextInt(); c=sc.nextInt();
		if(a>=x)
		{
			a-=x; total=a+b+c;
			if(a+b>=y)
			{
				total-=y;
				if(total<z)
					flag=-1;
			}
			else
				flag=-1;
		}
		else
			flag=-1;
		if(flag==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}