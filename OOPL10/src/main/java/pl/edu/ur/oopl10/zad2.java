
package pl.edu.ur.oopl10;
public class zad2
{
  public static void zad2()
  {
    //zadanie 2
    int marks[] = { 1, 2, 3 };
    System.out.println("numer 1");
 
    try
    {
      int m1 = marks[3];
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("wyjątek."  + e );
    }
    System.out.println("numer 2");
    System.out.println("numer 3");
    
  }
}  