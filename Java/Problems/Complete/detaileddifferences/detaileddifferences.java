import java.util.*;
import java.io.*;
public class detaileddifferences
{
  public static void main (String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int loop = sc.nextInt();
    for(int i=0; i<loop; i++)
    {
        String line = sc.next();
        String line2 = sc.next();
        System.out.println(line);
        System.out.println(line2);
        for(int j=0; j< line.length(); j++){
            if(line.substring(j, j+1).equals(line2.substring(j, j+1))){ 
              System.out.print(".");
            }
            else{
              System.out.print("*");
            }
        }
        System.out.println("");
        System.out.println("");

        
        
    }

  }

}