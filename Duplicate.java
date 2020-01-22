import java.util.*;
//remove duplicates from an unsorted array
class Duplicate
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int b[]=new int[20];//Hashing
		for(int i=0;i<n;i++)
		{
			b[a[i]]++;
		}
		for(int i=0;i<n;i++)
		{
			if(b[a[i]]!=0)//so that it will print only once
				System.out.print(a[i]+" ");
			b[a[i]]=0;
		}

	}
}