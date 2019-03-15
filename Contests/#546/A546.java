import java.io.*;
import java.util.*;

public class A546
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, chap=0, u, v, k;
		n=sc.nextInt();
		int[] pages = new int[10002];
		for(i=0; i<n; i++)
		{
			u=sc.nextInt(); v=sc.nextInt();
			pages[v]=1;
		}
		k=sc.nextInt();
		for(i=1; i<=k-1; i++)
			chap+=pages[i];
		System.out.println(n-chap);
	}
}