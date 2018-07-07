import java.util.Scanner;
public class everywhere{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        int loop=sc.nextInt();
        
        for (int i=0; i<loop; i++){
            String[] array = new String[100];
            int list = sc.nextInt();
            int cities=0;
            
            for(int j=0; j<list; j++){
                String city = sc.next();
                Boolean alreadyThere = false; 
                for(int k=0; array[k] != null; k++){
                    if(city.equals(array[k])){//Forwhatever reason it's not seeing that these are not equal
                        alreadyThere = true;
                        break;
                    }
                }
                if(alreadyThere != true){
                    array[cities] = city;
                    cities +=1;
                }
            }
            System.out.println(cities);
        }

    }
}