class Excep
{
   public static void main(String[] args)
   {
     try{
           try{
                  String s1=null;
                  System.out.println("s1.length");
           }catch(NullPointerException e)
           {
                System.out.println("String is null");
           }
          try    //second inner
	    {
             int[]a={10,20,30};
             a[4]=3;
          }
          catch(ArrayIndexOutOfBoundsException e)
          {
             System.out.println("array outside range");
           }
       }catch(Exception e)
    {
      System.out.println("handled");
    }
    System.out.println("normal flow");


    }
}      