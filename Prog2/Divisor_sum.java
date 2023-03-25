import java.util.Scanner;
interface DSum   
{
    int divisor_sum(int n);
}
class Divisor_sum implements DSum
{
    int s=0;
    public int divisor_sum(int n)
    {
        for (int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                s+=i;
            }
        }
        return s;
    }
    public static void main(String [] args)
    {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        DSum d=new Divisor_sum();
        System.out.println("SUM: "+d.divisor_sum(n));
        a.close();
    }
}
