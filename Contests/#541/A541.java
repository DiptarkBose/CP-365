import java.io.*;
import java.util.*;

public class A541
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long w1, h1, w2, h2, ans;
		w1=sc.nextLong(); h1=sc.nextLong(); w2=sc.nextLong(); h2=sc.nextLong();
		ans=(2*(h1+h2+w1))+4;
		System.out.println(ans);
	}
}