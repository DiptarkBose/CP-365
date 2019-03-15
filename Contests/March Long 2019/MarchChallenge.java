import java.io.*;
import java.util.*;

class MarchChallenge
{
	public static void main(String[] args) {
		int n, i, j;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		String[] arr = new String[n];
		for(i=0; i<n; i++)
			arr[i]=sc.next();
		for(i=n-1; i>=n/2; i--)
			for(j=0; j<arr[i].length(); j++)
				System.out.print((i+1)+" ");
		for(i=0; i<n/2; i++)
			for(j=0; j<arr[i].length(); j++)
				System.out.print((i+1)+" ");
		System.out.println();
	}
}