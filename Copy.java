import java.util.Scanner;
public class Copy 
{
    public static void main(String[] args) 
    {
       Scanner s = new Scanner(System.in);
       int a[][]= new int[10][10];
       int b[][]= new int[10][10];
       System.out.print("Enter the number of rows :");
       int r = s.nextInt();
       System.out.print("Enter the number of columns :");
       int c = s.nextInt();
       for( int i=0;i<r;i++)
       {
        for(int j=0;j<c;j++)
        {
            System.out.print("Enter the element of "+i+j+" : ");
            a[i][j]=s.nextInt();
        }
       } 
       System.out.println("The elements in Matrix B are : ");
       for( int i=0;i<r;i++)
       {
        System.out.print("[");
        for(int j=0;j<c;j++)
        {
            b[i][j]=a[i][j];
            System.out.print(" "+b[i][j]+" "); 
        }
        System.out.print("]");
        System.out.println();
       } 
       s.close();
    } 
}
