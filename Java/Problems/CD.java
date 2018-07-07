import java.util.*;
public class CD{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int list1 = sc.nextInt();
        int list2 = sc.nextInt();

        while(list1 !=0 && list2 !=0)
        {
            int counter=0;
            int array[] = new int[500000]; // a list of all possible cds divided by 2
            int number =0;
            for(int i=0; i<list1; i++){
                number = sc.nextInt();
                array[number/2] = (array[number/2]==1 || array[number/2]==0) ? 2 : number%2;
            }
            for(int i=0; i<list2; i++){
                number=sc.nextInt();
                if(array[number/2] == 2 || array[number/2] == number%2){
                    counter++;
                }
            }
            list1=sc.nextInt(); //reading in the last 2 zeros
            list2=sc.nextInt();
            System.out.println(counter);
        }
    }
}