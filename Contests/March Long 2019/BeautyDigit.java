import java.io.*;
import java.util.*;

class BeautyDigit
{
	public static void main(String[] args) {
		int t, d, count, i, pos, min;
		String s, ans;
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0)
		{
			s=sc.next();
			s+=sc.nextLine();
			String[] arr = s.split(" ");
			d=Integer.parseInt(arr[1]);
			pos=0; min=Integer.MAX_VALUE; ans="";
			for(i=0; i<arr[0].length(); i++)
				if(arr[0].charAt(i)-'0'==0)
					break;
			if(i<arr[0].length())
			{
				pos=i;
				for(i=0; i<pos; i++)
					min=Math.min(min, arr[0].charAt(i)-'0');
				ans+=min;
			}
			for(i=pos; i<arr[0].length(); i++)
				if(arr[0].charAt(i)-'0'<d)
					ans+=(arr[0].charAt(i)-'0');
			pos=ans.length();
			for(i=0; i<(arr[0].length()-pos); i++)
				ans+=d;
			System.out.println(ans);
		}
	}
}