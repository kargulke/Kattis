import java.util.*;

public class nasty{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i=0; i< count; i++){
            int dont = sc.nextInt();
            int advertise = sc.nextInt();
            advertise -= sc.nextInt();
            if(advertise > dont)
                System.out.println("advertise");
            else if(advertise < dont)
                System.out.println("do not advertise");
            else
                System.out.println("does not matter");
        }
    }
}