import java.util.*;
import java.io.*;
public class Trik{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int position = 1;
        String array[] = line.toUpperCase().split("");
        for(String letter : array){
            switch(letter){
                case "A":
                    if(position!=3){
                        position = (position==1)? 2 : 1;
                    }
                    break;
                case "B":
                    if(position!=1){
                        position = (position==2)? 3 : 2;
                    }
                    break;
                case "C":
                    if(position!=2){
                        position = (position==1)? 3 : 1;
                    }
                    break;
            }
        }
        System.out.println(position);
        
    }
}