import java.util.*;
class Deque
{
   int ar[]=new int[10];
   int f=-1;
   int r=-1;
   int i=0;
   boolean overflow()
   {
   	if(f==0&&r==ar.length-1)
   	return true;
   	else if(f==r-1)
   	return true;
   	else
   	return false;
   }
   boolean underflow()
   {
   	if(f==-1)
   	  return true;
   	else
   	  return false;
   }
   void addf(int a)
   {
    if(overflow())
    System.out.println("full");
     if (underflow()) 
        { 
            f = 0; 
            r = 0; 
        }
        else if (f == 0) 
            f = ar.length-1; 
   
        else 
           f++;
      ar[f]=a;
      print();
    }
    void addr(int a) 
    { 
        if (overflow()) 
        { 
            System.out.println(" Overflow ");  
        } 
        if (f == -1) 
        { 
            f = 0; 
            r= 0; 
        } 
        else if (r==ar.length-1) 
            r = 0; 
        else
            r = r+1; 
        ar[r] = a ; 
        print();
    } 
    void removef() 
    { 
        if (underflow()) 
        { 
            System.out.println("Empty"); 
            return;
        } 
        if (f==r) 
        { 
            f = -1; 
            r = -1; 
        } 
        else 
           { if (f == ar.length-1) 
                f = 0; 
   
            else 
                f++;
            }
            print();
    } 
    void remover() 
    { 
        if (underflow()) 
        { 
            System.out.println("Underflow"); 
            return ; 
        } 
        if (f==r) 
        { 
            f = -1; 
            r = -1; 
        } 
        else if (r == 0) 
            r = ar.length-1; 
        else
            r--; 
        print();
    }
    void print()
  {
    for(i=f;i<=r;i++)
    {
      System.out.print(ar[i]+" ");
    }
    System.out.println();
  }
 
    
}
class Dequeue
{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
Deque dq=new Deque();
int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    
    for(int j=0;j<n;j++)
     { dq.addf(a[j]); 
      dq.addr(a[j]); 
      }
    
    for(int j=0;j<n;j++)
    { 
    dq.removef();
    dq.remover(); 

    }

}
}