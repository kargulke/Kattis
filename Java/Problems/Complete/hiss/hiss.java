import java.util.*;
import java.lang.*;

public class hiss{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean hisses = str.contains("ss");
        if(hisses){
            System.out.println("hiss");
        }
        else{
            System.out.println("no hiss");
        }
    }
}