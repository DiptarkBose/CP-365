import java.io.*;
import java.util.*;

public class B542
{
	public static void main(String[] args) {
		int n, i, j, elem;
		long dist;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int[] arr = new int[n];
		Map<Integer, Vector<Integer>> m = new TreeMap<Integer, Vector<Integer>>();
		for(i=0; i<(2*n); i++)
		{
			elem=sc.nextInt();
			Vector<Integer> vct;
			if(!m.containsKey(elem))
				vct=new Vector<Integer>();
			else
				vct=m.get(elem);
			vct.add(i);
			m.put(elem, vct);
		}
		i=0; j=0; dist=0;
		for(Map.Entry<Integer, Vector<Integer>> e: m.entrySet())
		{
			if((Math.abs(e.getValue().get(0)-i)+Math.abs(e.getValue().get(1)-j)) < (Math.abs(e.getValue().get(1)-i)+Math.abs(e.getValue().get(0)-j)))
			{
				dist+=(Math.abs(e.getValue().get(0)-i)+Math.abs(e.getValue().get(1)-j));
				i=e.getValue().get(0);
				j=e.getValue().get(1);
			}
			else
			{
				dist+=(Math.abs(e.getValue().get(1)-i)+Math.abs(e.getValue().get(0)-j));
				i=e.getValue().get(1);
				j=e.getValue().get(0);
			}
		}
		System.out.println(dist);
	}
}