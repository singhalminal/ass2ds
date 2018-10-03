import java.util.Scanner;
class que5
{
	static void fun(int[] a,int i,int j )
	{
		int temp;
         while(i<j)
         {
         	temp=a[i];
         	a[i]=a[j];
         	a[j]=temp;
         	i++;
         	j--;
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
		fun(a,0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}