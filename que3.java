import java.util.Scanner;
class que3
{
	static void fun(int[] a,int[] b,int n,int m)
	{
		int i=0,j=0;
		while(i<m&&j<m)
		{
			if(a[i]<b[j])
			{
				i++;
			}
			else if(b[j]<a[i])
			{
				j++;
			}
			else
			{
				System.out.print(a[i]+" ");
				i++;
				j++;
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int m=s.nextInt();
		int[] b=new int[m];
		for(int i=0;i<m;i++)
		{
			b[i]=s.nextInt();
		}
		fun(a,b,n,m);
	}
}