import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i;
        
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            if(x[i+1]<=x[i])
            {
            System.out.println("no");
            System.exit(0);
            }
        }
        System.out.println("yes");
        
    }
}