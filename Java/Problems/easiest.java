import java.util.*;
import java.io.*;
public class easiest{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        long multiplier = sc.nextInt();
        int num = sc.nextInt();
        while(num>0){
            num *= multiplier;
            int sum=0;
            for(int i=0; num>0; i++){
                sum += num % 10;
                num = num / 10; 
                System.out.println(num + " " + sum);
            }
            System.out.println(sum);
            num = sc.nextInt();
        }
    }
}