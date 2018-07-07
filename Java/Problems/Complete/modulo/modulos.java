import java.util.*;
public class modulos{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[42];
        int num;
        int count=0;
        while(sc.hasNextInt()){
            num = sc.nextInt();
            if(arr[ (num%42) ] == false){
                arr[num%42] = true;
                count++;
            }    
        }
        System.out.println(count);
    }
}