import java.util.Scanner;
class temp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float c,fa;
        fa=sc.nextFloat();
        c=((fa-32)*5)/9;
        System.out.printf("%.2f",c);
    }
}