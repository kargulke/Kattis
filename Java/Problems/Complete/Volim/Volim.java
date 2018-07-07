import java.util.*;
public class Volim{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        
        int timeR = 210; //Time Remaining
        int person = sc.nextInt(); 
        int probsR = sc.nextInt();
        String action = "";
        
        while(timeR > 0 && probsR > 0){
            timeR -= sc.nextInt();
            if(sc.next().equals("T") && timeR > 0){
                probsR -=1;
                person +=1;
                if(person == 9){
                    person = 1;
                }
            }
        }
        System.out.println(person);
    }
}