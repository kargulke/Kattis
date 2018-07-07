import java.util.*;
import java.io.*;
public class dice{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        double GunnarAverage =0;
        for(int i=0; i<2; i++){
            double sum=0;
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            for(int j = num1; j <= num2; j++){
                sum +=j;
            }
            GunnarAverage += sum/(num2-num1+1);
        }
        double EmmaAverage =0;
        for(int i=0; i<2; i++){
            double sum=0;
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            for(int j = num1; j <= num2; j++){
                sum +=j;
            }
            EmmaAverage += sum/(num2-num1+1);
        }
        if(GunnarAverage> EmmaAverage){
            System.out.println("Gunnar");
        }
        else if(GunnarAverage < EmmaAverage){
            System.out.println("Emma");
        }
        else{
            System.out.println("Tie");
        }
    }
}