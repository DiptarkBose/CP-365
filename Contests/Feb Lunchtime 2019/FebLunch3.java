import java.io.*;
import java.util.*;

class FebLunch3
{
	public static void main(String[] args) {
		int t, n, m, i, j, elem;
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0)
		{
			n=sc.nextInt(); m=sc.nextInt();
			int[][] mat = new int[n][m];
			for(i=0; i<n; i++)
			{
				for(j=0; j<m; j++)
				{
					elem=sc.nextInt();
					if(elem==0)
						mat[i][j]=-1;
					else
						mat[i][j]=0;
				}
			}
			Queue<Integer[]> q = new LinkedList<Integer[]>();
		}
	}
}