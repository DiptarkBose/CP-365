import java.io.*;
import java.util.*;

class FebLong6
{
	public static void main(String[] args) {
		int t;
		long dist1, dist2, dist3, dist4, dist5, x1, x4, y1, y4, a_x, c_x, a_y, c_y;
		double x_mid, y_mid;
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0)
		{
			System.out.println("Q 0 0");
			System.out.flush();
			dist1=sc.nextLong();
			if(dist1<0)
				System.exit(0);
			System.out.println("Q 0 1000000000");
			System.out.flush();
			dist2=sc.nextLong();
			if(dist2<0)
				System.exit(0);
			System.out.println("Q 1000000000 0");
			System.out.flush();
			dist3=sc.nextLong();
			if(dist3<0)
				System.exit(0);
			System.out.println("Q 1000000000 1000000000");
			System.out.flush();
			dist4=sc.nextLong();
			if(dist4<0)
				System.exit(0);
			
			a_x=(1000000000-dist3+dist1)/2;
			a_y=0;
			System.out.println("Q "+a_x+" "+a_y);
			System.out.flush();
			dist5=sc.nextLong();
			if(dist5<0)
				System.exit(0);
			y1=dist5;

			c_x=(1000000000-dist4+dist2)/2;
			c_y=1000000000;
			System.out.println("Q "+c_x+" "+c_y);
			System.out.flush();
			dist5=sc.nextLong();
			if(dist5<0)
				System.exit(0);
			y4=c_y-dist5;

			x1=dist1-y1;
			x4=2000000000-dist4-y4;

			System.out.println("A "+x1+" "+y1+" "+x4+" "+y4);
			System.out.flush();
			dist5=sc.nextLong();
			if(dist5<0)
				System.exit(0);
		}
	}
}