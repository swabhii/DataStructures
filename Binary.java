import java.util.*;
class Binary
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=s.nextInt();
		System.out.println("Enter the number to search");
		int num=s.nextInt();
		int left=0;
		int right=ar.length;
		int ans=binarySearch(ar,num,left,right);
		System.out.println(ans);

	}
	static int binarySearch(int a[],int num,int left,int right)
	{
		
		int mid=(left+right)/2;
		
		if(num==a[mid])
			{return mid;}

		else if(num>a[mid])
		{
			left=mid+1;
			return binarySearch(a,num,left,right);

		}
		else if(num<a[mid])
		{
			right=mid-1;
			return binarySearch(a,num,left,right);
		}
		else {return 0;}
	}

}