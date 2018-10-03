import java.util.Scanner;
class que2
{
	static void fun(int[] a,int n)
	{
		int temp;
	  for(int i=0;i<n-1;i++)
	  {
	  	for(int j=0;j<n-1-i;j++)
	  	{
	  		if(a[j]>a[j+1])
	  		{
	  			temp=a[j];
	  			a[j]=a[j+1];
	  			a[j+1]=temp;
	  		}
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
		fun(a,n);
		for(int j=0;j<n;j++)
		{
			System.out.print(a[j]+" " );
		}

	}
}