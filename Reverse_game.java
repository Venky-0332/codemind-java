import java.util.Scanner;
class Main
{
    public static int rev(int n)
    {
        int r=0;
        while(n!=0)
        {
         r=r*10+n%10;
         n=n/10;
        }
        return r;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[];
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print(rev(x[i])+" ");
        }
      
     
    }
    
}