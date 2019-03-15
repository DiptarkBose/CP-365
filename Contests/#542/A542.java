import java.io.*;
import java.util.*;

public class A542
{
	public static void main(String[] args) {
		int n, a, d, i, z, pos_z=0, neg_z=0;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int[] arr = new int[n];
		for(i=0; i<n; i++)
			arr[i]=sc.nextInt();
		z=n/2;
		if(n%2!=0)
			z++;
		for(i=0; i<n; i++)
		{
			if(arr[i]>0)
				pos_z++;
			else if(arr[i]<0)
				neg_z++;
		}
		if(pos_z>=z)
				System.out.println("1");
		else if(neg_z>=z)
			System.out.println("-1");
		else
			System.out.println("0");
	}
}