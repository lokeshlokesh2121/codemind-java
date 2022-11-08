import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int C;
        float F;
        C=Sc.nextInt();
        F=(float)(9*C)/5+32;
        System.out.format("%.2f",F);
    }
}