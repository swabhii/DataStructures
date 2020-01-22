import java.util.*;
class Selection
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		

		for(int k=0;k<n;k++)
		{
			
			int index=k;
			for(int i=k+1;i<n;i++)
			{
				if(a[i]<a[index])
						index=i;
			}
			int temp=a[index];
			a[index]=a[k];
			a[k]=temp;
		}

		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}