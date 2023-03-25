import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception 
{
 public static void main(String[] args) 
 {
    Scanner s = new Scanner(System.in);
    try 
    {
        System.out.print("Enter a number :");
        int a=s.nextInt(); 
        System.out.print("Enter a number :");
        int b=s.nextInt(); 
        int d=a/b;
        System.out.println("Quotient : "+d);    
    } 
    catch (ArithmeticException e) 
    {
        System.out.println(e);   
    }
    catch (InputMismatchException e) 
    {
        System.out.println(e);   
    } 
    System.out.println("EOL");
    s.close(); 
 } 

}
