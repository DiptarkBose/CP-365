import java.io.*;
import java.util.*;

class NumGame
{
	public static void main(String[] args) {
		int t, n, i, pos_count, neg_count, zero_count;
		long elem;
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0)
		{
			n=sc.nextInt(); zero_count=0; neg_count=0; pos_count=0;
			for(i=0; i<n; i++)
			{
				elem=sc.nextLong();
				if(elem>0)
					pos_count++;
				else if(elem==0)
					zero_count++;
				else
					neg_count++;
			}
			System.out.print(Math.max(Math.max(zero_count, neg_count), pos_count)+" ");
			Vector<Integer> vct = new Vector<Integer>();
			if(zero_count!=0)
				vct.add(zero_count);
			if(pos_count!=0)
				vct.add(pos_count);
			if(neg_count!=0)
				vct.add(neg_count);
			Collections.sort(vct);
			System.out.println(vct.get(0));
		}
	}
}