import java.util.Scanner;
class Do
{
    public static void main(String[] args)
    {
       int k1=0,k2=1,k3;
       do
       {
          k3=k1+k2;
          System.out.println(k3+" ");
          k1=k2;
          k2=k3;
        }
        while (k3<=55);
     }
}