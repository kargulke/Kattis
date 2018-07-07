import java.util.*;
public class SpeedLimit{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop!=-1){
            int total=0, mph=0, time=0, prev=0;
            for(int i=0; i<loop; i++){
                mph = sc.nextInt();
                time = sc.nextInt();
                total += mph*(time-prev);
                prev = time;
            }
            System.out.println(total+" miles");
            loop = sc.nextInt();
        }
    }
}