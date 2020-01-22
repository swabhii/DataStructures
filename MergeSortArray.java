import java.util.*;
class MergeSortArray
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		

		
		int a[]=new int[n];
		int i=0,j=0;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}

		int m=s.nextInt();
		int b[]=new int[m];
		for(i=0;i<m;i++)
		{
			b[i]=s.nextInt();
		}
		 i=0;j=0;
		 int h=m+n;
		int c[]=new int[h];
		for(int k=0;k<h;k++)
		{
			if(a[i]<b[j])
			{
				if(i==n)
				{
					while(j!=b.length)
						{
							c[k]=b[j];
							j++;
						}
						break;
				}

				c[k]=a[i];
				i++;

			}
			else 
			{
				if(j==m)
				{
					while(i!=a.length)
						{
							c[k]=a[i];
							i++;
						}
						break;
				}

				c[k]=b[j];
				j++;
			}
		}
		for( i=0;i<h;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}