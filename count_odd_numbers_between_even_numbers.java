import java.util.Scanner;
class Main
{
    public static boolean odd(int n)
    {
        if(n%2==1)
        return true;
        else 
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n=sc.nextInt(),count=0;
        x=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        int d1=0,d2=0;
        for(int i=0;i<n;i++)
        {
            if(x[i]%2==0)
            {
            d1=i;
            break;
            
            }
        } 
        for(int i=n-1;i>=0;i--)
        {
            if(x[i]%2==0)
            {
            d2=i;
            break;
            }
        }
        
        for(int i=d1+1;i<d2;i++)
        {
               if(odd(x[i]))
                count++;
            
        }
        System.out.println(count);
    }
}