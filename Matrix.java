import java.util.Scanner;
class Matrix
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int a [][] = new int[10][10];  
        int b [][] = new int[10][10];   
        int d [][] = new int[10][10]; 
        System.out.print("Enter the number of rows in Matrix A : ");
        int r = s.nextInt();
        System.out.print("Enter the number of columns in Matrix A : ");
        int c = s.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print("Enter the elemnet for "+i+j+" :");
                a[i][j] = s.nextInt();
            }   
        }
        System.out.print("Enter the number of rows in Matrix B : ");
        int r1 = s.nextInt();
        System.out.print("Enter the number of columns in Matrix B : ");
        int c1 = s.nextInt();
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print("Enter the elemnet for "+i+j+" :");
                b[i][j] = s.nextInt();
            }   
        }
        if((r==r1)&&(c==c1))
        {
            System.out.println("The Sum of the Matrix : ");
            for(int i=0;i<r;i++)
            {
                System.out.print("[");
                for(int j=0;j<c;j++)
                {
                    d[i][j]=a[i][j]+b[i][j];
                    System.out.print(" "+d[i][j]+" ");
                } 
                System.out.print("]");
                System.out.println();  
            } 
        }
        s.close();
    }
}