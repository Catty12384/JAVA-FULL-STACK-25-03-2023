import java.util.Scanner;
class MyBook extends Book
{
    void setTitle(String s)
    {
        this.title=s;
    }
    public static void main(String [] args)
    {
        Scanner a= new Scanner(System.in);
        MyBook m=new MyBook();
        String s=a.nextLine();
        m.setTitle(s);
        System.out.println("The title is: "+m.getTitle());
        
        a.close();
    }
}