import java.util.*;
import java.io.*;
public class reverserot{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int shift = sc.nextInt();
        String array = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
        while(shift != 0){
            String phrase = sc.next();
            for(int i=phrase.length()-1; i>=0; i--){
                char character = phrase.charAt(i);
                int num = (int) character;
                int pos = 0;
                if(num == 95){
                    pos=26;
                }
                else if(num==46){
                    pos=27;
                }
                else{
                    pos = num - 65;
                }
                System.out.print(array.substring((pos+shift)%array.length(), (pos+shift)%array.length()+1));
            }
            shift = sc.nextInt();
            System.out.println("");
        }
    }
}