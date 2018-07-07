import java.util.*;
import java.lang.Math;
public class oddities{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int iterations = sc.nextInt();
        for(int i=0; i<iterations;i++){
            int num = sc.nextInt();
            System.out.println(num + ((Math.abs(num)%2==1) ? " is odd": " is even")); 
        }
    }
}