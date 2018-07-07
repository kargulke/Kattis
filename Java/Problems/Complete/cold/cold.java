import java.util.*;
import java.io.*;
public class cold{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        int counter=0;
        for(int i=0; i<loop; i++){
            int number = sc.nextInt();
            if(number<0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}