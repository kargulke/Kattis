import java.io.*;
import java.util.*;
public class Pet{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int maxLine = 0;
        int maxNum = 0;
        for(int j=1; j<6; j++){
            int line =0;
            for(int i =1; i<5; i++){
                line+=sc.nextInt();
            }
            if(maxNum < line){
                maxNum=line;
                maxLine=j;
            }
        }
        System.out.println(maxLine + " " + maxNum);
    }
}