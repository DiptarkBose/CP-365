import java.io.*;
import java.util.*;

class FebLong7
{
	public static long modExp(long x, long n, long m)
	{
		long result=1;
		while(n>0)
		{
			if(n%2!=0)
				result=(result*x)%m;
			x=(x*x)%m;
			n/=2;
		}
		return result;
	}
	public static void main(String[] args) {
		long t, N, K, M, n, ans, mod=1000000007l, p, q, invq, term1, term2, z;
		Scanner sc = new Scanner(System.in);
		t=sc.nextLong();
		while(t-->0)
		{
			N=sc.nextLong(); K=sc.nextLong(); M=sc.nextLong(); ans=0l;
			if(M%2!=0)
			{
				n=(M+1)/2;
				p=(modExp(N, n, mod)-modExp(N-1, n, mod)+mod)%mod;
				q=modExp(N, n , mod);	
			}
			else
			{
				n=M/2;
				term1=(modExp(N-1, n, mod)*modExp(N+K-1, 1, mod))%mod;
				term2=(modExp(N, n, mod)*modExp(N+K, 1, mod))%mod;
				p=(term2-term1+mod)%mod;
				q=(modExp(N, n, mod)*modExp(N+K, 1, mod))%mod;
			}
			invq=modExp(q, mod-2, mod);
			ans=(p*invq)%mod;
			System.out.println(ans);
		}
	}
}
