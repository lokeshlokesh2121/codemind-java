import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int a,b,c;
        float S,area;
        a=Sc.nextInt();
        b=Sc.nextInt();
        c=Sc.nextInt();
        S=(float)(a+b+c)/2;
        area=(float)Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.format("%.2f",area);
        //System.out.println(area);
        
    }
}