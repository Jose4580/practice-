public class Exceptiondemo
{
   public static void main(String[] args)
   {
      try   
      {
          String s1=null;
          System.out.println("s1.length");
        }
        catch(NullPointerException e)
        {
           System.out.println("String is null");
         }
           System.out.println("normal code");
           System.out.println("byeee");
    }
}