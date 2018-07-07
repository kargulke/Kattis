import java.util.*;
import java.text.*;
public class grassSeed{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        double cost = sc.nextDouble();
        int count = sc.nextInt();
        double total =0.00000000;
        for(int i=0; i< count; i++){
            double  w = sc.nextDouble();
            double l = sc.nextDouble();
            total += w*l*cost;
            System.out.println(w +" "+ l +" "+ cost);
            System.out.println(w*l);
            System.out.println(w*l*cost);
            System.out.println(total);
        }
        DecimalFormat df = new DecimalFormat("0.0000000");
        
        System.out.println(df.format(total));
    }
}