import java.util.*;
public class Bijele{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        
        //1 King
        int number = sc.nextInt();
        System.out.print(1-number + " ");
        
        //1 Queen
        number = sc.nextInt();
        System.out.print(1-number + " ");

        //2 Rooks
        number = sc.nextInt();
        System.out.print(2-number + " ");

        //2 Bishops
        number = sc.nextInt();
        System.out.print(2-number + " ");

        //2 Knights
        number = sc.nextInt();
        System.out.print(2-number + " ");

        //8 Pawns
        number = sc.nextInt();
        System.out.print(8-number + " ");
    }
}