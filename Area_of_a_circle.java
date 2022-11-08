import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        
        float pi=3.14f,area;
        int r;
        r=Sc.nextInt();
        area=pi*r*r;
        System.out.format("%.2f",area);
    }
}