import java.io.*;
import java.util.*;

class SeptLong1
{
	public static void main(String[] args) {
		int t, n, i, j, elem, count, cost;
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0)
		{
			Map<Integer, Integer[]> pos = new TreeMap<Integer, Integer[]>();
			n=sc.nextInt();
			for(i=0; i<n; i++)
			{
				for(j=0; j<n; j++)
				{
					elem=sc.nextInt();
					Integer[] arr = {i, j};
					pos.put(elem, arr);
				}
			}
			count=0; cost=0; i=0; j=0;
			for(Map.Entry<Integer, Integer[]> e : pos.entrySet())
			{
				if(count!=0)
				{
					cost+=(Math.abs(e.getValue()[0]-i) + Math.abs(e.getValue()[1]-j));
					i=e.getValue()[0];
					j=e.getValue()[1];
				}
				else
				{
					i=e.getValue()[0];
					j=e.getValue()[1];
				}
				count++;
			}
			System.out.println(cost);
		}
	}
}