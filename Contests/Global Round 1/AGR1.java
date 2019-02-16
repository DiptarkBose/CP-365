import java.io.*;
import java.util.*;

public class AGR1
{
	public static void main(String[] args) {
		int b, k, odd=0, even=0, elem, i;
		String ans="";
		Scanner sc = new Scanner(System.in);
		b=sc.nextInt();
		k=sc.nextInt();
		for(i=0; i<k-1; i++)
		{
			elem=b*sc.nextInt();
			if(elem%2==0) even++;
			else odd++;
		}
		elem=sc.nextInt();
		if(elem%2==0) even++;
		else odd++;
		if(k%2==0)
		{
			if(odd%2==0 && even%2==0) ans="even";
			else ans="odd";
		}
		else
		{
			if(odd%2==0) ans="even";
			else ans="odd";
		}
		System.out.println(ans);
	}
}