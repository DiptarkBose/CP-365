import java.io.*;
import java.util.*;

public class C60
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x1, y1, x2, y2, move_x, move_y;
		int n, i;
		String s;
		n=sc.nextInt();
		s=sc.next();
		char[] winds = s.toCharArray();
		if(x2-x1==0 && y2-y1>0)
		{
			dir_y='U'; move_y=y2-y1;
			dir_x='A'; move_x=0;
		}
		else if(x2-x1==0 && y2-y1<0)
		{
			dir_y='D'; move_y=y1-y2;
			dir_x='A'; move_x=0;
		}
		else if(x2-x1>0 && y2-y1==0)
		{
			dir_y='A'; move_y=0;
			dir_x='R'; move_x=x2-x1;
		}
		else if(x2-x1<0 && y2-y1==0)
		{
			dir_y='A'; move_y=0;
			dir_x='L'; move_x=x1-x2;
		}
		else if(x2-x1>0 && y2-y1>0)
		{
			dir_y='U'; move_y=y2-y1;
			dir_x='R'; move_x=x2-x1;
		}
		else if(x2-x1>0 && y2-y1<0)
		{
			dir_y='D'; move_y=y1-y2;
			dir_x='R'; move_x=x2-x1;
		}
		else if(x2-x1<0 && y2-y1<0)
		{
			dir_y='D'; move_y=y1-y2;
			dir_x='L'; move_x=x1-x2;
		}
		else if(x2-x1<0 && y2-y1>0)
		{
			dir_y='U'; move_y=y2-y1;
			dir_x='L'; move_x=x1-x2;
		}
		
	}
}