import java.util.*;
import java.lang.*;

public class Tarifa{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int loop = sc.nextInt();
        int count=0;
        for(int i=0; i<loop; i++)
            count+=sc.nextInt();
        count = max*loop - count;
        if(count<0)
            count = 0;
        count += max;
        System.out.println(count);
    }
}