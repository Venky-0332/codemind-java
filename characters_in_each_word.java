import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch!=' ')
            {
                count++;
            }
            else
            {
                System.out.print(count+" ");
                count=0;
            }
        }
        System.out.print(count+" ");
    }
}