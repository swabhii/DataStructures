import java.util.*;
class Bubble
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=s.nextInt();
		sort(ar);
		for(int i=0;i<n;i++)
			System.out.println(ar[i]);
	}


		static void sort(int a[])
		{
			int temp=-1;
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[j]<a[i])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;

					}
				}
			}

		
	}
}