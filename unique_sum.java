import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,j,sum=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
           
                if(x[i]!=-99)
                {
                    for(j=0;j<n;j++)
                    {
                        if(x[i]==x[j] && i!=j)
                        {
                            x[j]=-99;
                        }
        
                    }
                    sum=sum+x[i];
                }
                 
            
            
        
        }
        System.out.println(sum);
    }
}