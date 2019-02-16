import java.io.*;
import java.util.*;

public class A536
{
	public static void main(String[] args) {
		int n, i, j, count=0;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		char[][] mat = new char[n][n];
		String s;
		for(i=0; i<n; i++)
		{
			s=sc.next();
			s+=sc.nextLine();
			for(j=0; j<n; j++)
				mat[i][j]=s.charAt(j);
		}
		for(i=1; i<=n-2; i++)
			for(j=1; j<=n-2; j++)
				if(mat[i][j]=='X' && mat[i-1][j-1]=='X' && mat[i-1][j+1]=='X' && mat[i+1][j-1]=='X' && mat[i+1][j+1]=='X')
					count++;
		System.out.println(count);
	}
}