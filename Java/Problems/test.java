import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputID;
        do{
            inputID = sc.next();
            System.out.println(Character.getNumericValue(inputID.charAt(0)));
        }while(Character.getNumericValue(inputID.charAt(0)) >= 0 && Character.getNumericValue(inputID.charAt(0)) <= 9 && (inputID.length() == 1));
    }
}
