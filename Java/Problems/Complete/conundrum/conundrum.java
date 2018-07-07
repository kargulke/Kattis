import java.io.*;
import java.util.*;
public class conundrum{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        String cript = sc.next();
        int counter = 0;
        for(int i =0; i<cript.length(); i+=3){
            if(!cript.substring(i, i+1).equals("P")){
                counter++;
            }
            if(!cript.substring(i+1, i+2).equals("E")){
                counter++;
            }
            if(!cript.substring(i+2, i+3).equals("R")){
                counter++;
            }
        }
        System.out.println(counter);
    }
}