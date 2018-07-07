import java.util.*;
public class Spavanac{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        min-=45;
        if(min<0){
            hour-=1;
            if(hour<0){
                hour += 24;
            }
            min += 60;
        }
        System.out.print(hour + " "+ min);
    }
}