
import java.util.*;
class Sample
{
    public static void main(String args[])
    {
    float a,b,c,s;
    double area;
    Scanner sc=new Scanner(System.in);
    a=sc.nextFloat();
    b=sc.nextFloat();
    c=sc.nextFloat();
    s=(a+b+c)/2;
   area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.format("%.2f",area);
    }
}