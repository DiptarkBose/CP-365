import java.io.*;
import java.util.*;

class FebCook2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t, n, i, joined;
		t=sc.nextInt();
		while(t-->0)
		{
			n=sc.nextInt();
			int[] arr = new int[n];
			for(i=0; i<n; i++)
				arr[i]=sc.nextInt();
			Arrays.sort(arr);
			joined=0;
			for(i=0; i<n; i++)
			{
				if(joined>=arr[i])
					joined++;
				else
					break;
			}
			System.out.println(joined);
		}
	}
}