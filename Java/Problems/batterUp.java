import java.util.*;
public class batterUp{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int num = input;
        double total=0;
        for(int i=0; i < input; i++){
            int in = sc.nextInt();
            if(in == -1){
                num--;
                total++;
            }else{
                total += sc.nextInt();
            }
        }
        System.out.println(Math.ceil(total/num));
    }
}