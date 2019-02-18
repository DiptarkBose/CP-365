import java.io.*;
import java.util.*;

class FebCook1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long t, n, b, w, h, p, max_area;
		int i;
		t=sc.nextLong();
		while(t-->0)
		{
			n=sc.nextLong(); b=sc.nextLong(); 
			max_area=-1l;
			for(i=0; i<n; i++)
			{
				w=sc.nextLong(); h=sc.nextLong(); p=sc.nextLong();
				if(p<=b)
					max_area=Math.max(max_area, (h*w));
			}
			if(max_area==-1l)
				System.out.println("no tablet");
			else
				System.out.println(max_area);
		}
	}
}