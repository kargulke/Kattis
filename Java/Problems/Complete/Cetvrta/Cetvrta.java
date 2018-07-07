import java.util.*;
import java.io.*;
public class Cetvrta{
    public static void main(String Args[]){
        int[][] array = new int[][]{{-1,-1},{-1,-1}};
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            for(int k=0; k<2; k++){
                int variable = sc.nextInt();
                for(int j=0; j<2; j++){
                    
                    if(variable==array[j][k]){
                        array[j][k]=-1;
                        break;
                    }
                    else if(array[j][k]==-1){
                        array[j][k]=variable;
                        break;
                    }
                    else{
                        continue;
                    }
                }    
            }
        }
        for(int j=0; j<2; j++){
            if(array[j][0] != -1){
                System.out.print(array[j][0]);
                break;
            }
        }
        System.out.print(" ");
        
        for(int j=0; j<2; j++){
            if(array[j][1] != -1){
                System.out.print(array[j][1]);
                break;
            }
        }
    }
}