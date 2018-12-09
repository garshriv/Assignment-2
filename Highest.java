import java.util.Scanner;
 
public class Highest
{
  public static void main(String args[])
  {
    int x, y, z;
    System.out.println("Enter three numbers");
    Scanner in = new Scanner(System.in);
 
    x = in.nextInt();
    y = in.nextInt();
    z = in.nextInt();
 
    if (x > y && x > z)
      System.out.println("First number is Highest.");
    else if (y > x && y > z)
      System.out.println("Second number is Highest.");
    else if (z > x && z > y)
      System.out.println("Third number is Highest.");
    else
      System.out.println("The numbers are not distinct.");
  }
}