import java.util.*;
class InsertionSort
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int min;
		for(int i=0;i<n;i++)
		{
			//min=a[i];
			int index=i;
			for(int j=i;j>=0;j--)
			{
				if(j==0)
					break;
				if(a[j]<a[j-1])
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}

			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
