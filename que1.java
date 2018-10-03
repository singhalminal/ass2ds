import java.util.Scanner;
class que1
{
	static int fun(int[] a,int n)
	{
	int max;
	max=a[0];
	for(int j=1;j<n;j++)
	{
		if(a[j]>max)
		{
			max=a[j];
		}
	}
	return max;	
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
		int p=fun(a,n);
		System.out.println(p);
	}
}