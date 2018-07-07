import java.util.*;
import java.io.*;
public class pot
{

  public static void main (String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int loop = sc.nextInt();
    long answer=0;
    for(int i=0; i<loop; i++)
    {
        
        String number = sc.next();
        answer += Math.pow(Integer.parseInt(number.substring(0, number.length()-1)), Integer.parseInt(number.substring(number.length()-1, number.length())));
    }
    System.out.println(answer);

  }

}