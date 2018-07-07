import java.util.*;
import java.io.*;
//This is basically the basis for the program. you won't mess with 
//it, like at all. except for the part I surrounded in $$'s 
//This is where you put the name of the file of the document. 
//you'll notice that I have you type "pico timeloop.java". 
//Where the timeloops are should always be the same
public class timeloop{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        Integer loop = sc.nextInt();
        for(int i=0; i<loop; i++){
            System.out.print(i+1);
            System.out.println(" Abracadabra");
        }
    }
}