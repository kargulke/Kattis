import java.util.*;
public class Sibice{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int w = sc.nextInt();
        int l = sc.nextInt();
        int max = (int)Math.sqrt(Math.pow(w,2) + Math.pow(l,2));
        for(int i=0; i< count; i++){
            int match = sc.nextInt();
            if(match <= max){
                System.out.println("DA");
            }
            else{
                System.out.println("NE");
            }
        }
    }
}