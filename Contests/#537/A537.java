import java.io.*;
import java.util.*;

public class A537
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s, t;
		int i, flag=0;
		s=sc.next();
		s+=sc.nextLine();
		t=sc.next();
		t+=sc.nextLine();
		if(s.length()==t.length())
		{
			for(i=0; i<s.length(); i++)
			{
				if(s.charAt(i)!=t.charAt(i))
				{
					if(((s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') && (t.charAt(i)=='a' || t.charAt(i)=='e' || t.charAt(i)=='i' || t.charAt(i)=='o' || t.charAt(i)=='u')) || 
						((s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u') && (t.charAt(i)!='a' && t.charAt(i)!='e' && t.charAt(i)!='i' && t.charAt(i)!='o' && t.charAt(i)!='u')))
						continue;
					else
					{
						flag=-1;
						break;
					}
				}
			}
		}
		else
			flag=-1;
		if(flag==-1)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}