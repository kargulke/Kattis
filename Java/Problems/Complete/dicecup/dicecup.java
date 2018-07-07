import java.util.*;
public class dicecup{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int larger, smaller;
        if (num1 > num2){
            larger = num1;
            smaller = num2;
        }
        else{
            larger = num2;
            smaller = num1;
        }
        for(int i=smaller+1; i<=larger+1; i++){
            System.out.println(i);
        }
    }
}