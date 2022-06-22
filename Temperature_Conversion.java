import java.util.*;
class Temp
{
    public static void main(String args[])
    {
    float C;
    double F;
    Scanner sc=new Scanner(System.in);
    C=sc.nextFloat();
    F=(double)32+(C*(1.8));
    System.out.format("%.2f",F);
    }
}