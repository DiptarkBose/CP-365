import java.io.*;
import java.util.*;

public class BGR1
{
	static class Cell
	{
		int val, index;
		public Cell(int v, int i)
		{
			val=v;
			index=i;
		}
	}
	static class SortCell implements Comparator<Cell>
	{
		public int compare(Cell a, Cell b)
		{
			return a.val-b.val;
		}
	}
	public static void main(String[] args) {
		int n, m, k, i, j, index, length=0, h, ind;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt(); m=sc.nextInt(); k=sc.nextInt();
		int[] broken = new int[n];
		int[] dist = new int[n-1];
		for(i=0; i<n; i++)
			broken[i]=sc.nextInt();
		for(i=1; i<n; i++)
			dist[i-1]=broken[i]-broken[i-1];
		Cell[] cross = new Cell[n-1];
		for(i=0; i<n-1; i++)
			cross[i]= new Cell(dist[i], i);
		Arrays.sort(cross, new SortCell());
		i=n-2; k--;
		while(k>0 && i>=0)
		{
			ind=cross[i].index;
			dist[ind]=0;
			i--; k--;
		}
		Vector<Integer> vct = new Vector<Integer>();
		vct.add(broken[0]);
		for(i=1; i<=n-1; i++)
		{
			if(dist[i-1]==0)
			{
				if(vct.size()>1)
					length+=(vct.get(vct.size()-1)-vct.get(0)+1);
				else
					length+=1;
				vct.clear();
			}
			vct.add(broken[i]);
		}
		if(vct.size()!=0)
			length+=(vct.get(vct.size()-1)-vct.get(0)+1);
		System.out.println(length);
	}
}