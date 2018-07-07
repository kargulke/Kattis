import java.util.*;
import java.io.*;
public class zanzibar{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        for(int i=0; i< loop; i++){
            int Tourists = 0;
            int onIsland = sc.nextInt();
            int reCount = sc.nextInt();
            while(reCount != 0){
                if(0 < reCount - onIsland*2){
                    Tourists += reCount - onIsland*2;
                }//This bit of code is a bit iffy, see if theres a better way to do it
                onIsland = reCount;
                reCount = sc.nextInt();
            }
            System.out.println(Tourists);
        }
    }
}