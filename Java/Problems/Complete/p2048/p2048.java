import java.util.Scanner;
public class p2048{
    public static final int SIZE = 4;
    public static void main (String[] Args){
        //Creating matrix
        int [][] matrix = new int[SIZE][SIZE]; 
        //reading into matrix
        Scanner sc = new Scanner(System.in);
        for(int y = 0; y <SIZE; y++){
            for(int x = 0; x < SIZE; x++){
                matrix[x][y] = sc.nextInt();
            }
        }
        //choosing direction
        int choice = sc.nextInt();
        switch(choice){
            case 0: left (matrix); break;
            case 1: up   (matrix); break;
            case 2: right(matrix); break;
            case 3: down (matrix); break;
            default:
                System.out.println("not a valid number (0-3):");
                sc.nextInt();
        }
        //Output the matrix
        for(int y =0; y< SIZE; y++){
            for(int x = 0; x < SIZE; x++){
                System.out.print(matrix[x][y] +" ");
            }
            System.out.print("\n");
        }
    }
    public static void left (int[][] matrix){
        for(int y = 0; y < SIZE; y++){
            for(int x = 0; x < SIZE; x++){
                for(int tempx = x+1; tempx < SIZE; tempx++){
                    if(matrix[tempx][y]!=0){
                        if(matrix[x][y]==matrix[tempx][y]){
                            matrix[x][y] *= 2;
                            matrix[tempx][y] = 0;
                        }
                        else if(matrix[x][y] == 0){
                            matrix[x][y] = matrix[tempx][y];
                            matrix[tempx][y] = 0;
                            //handling of specific case: 16 16 16 16
                            if(tempx<3 && matrix[tempx+1][y]==matrix[x][y]){
                                matrix[tempx+1][y] = 0;
                                matrix[x][y] *= 2;
                            }
                        }
                        break;
                    }
                }
            }
        }
    }
    public static void down(int[][] matrix){
        for(int x = SIZE-1; x > -1; x--){
            for(int y = SIZE-1; y > -1; y--){
                for(int tempy = y-1; tempy > -1; tempy--){
                    if(matrix[x][tempy]!=0){
                        if(matrix[x][y]==matrix[x][tempy]){
                            matrix[x][y] *= 2;
                            matrix[x][tempy] = 0;
                        }
                        else if(matrix[x][y] == 0){
                            matrix[x][y] = matrix[x][tempy];
                            matrix[x][tempy] = 0;
                            //handling of specific case: 16 16 16 16
                            if(tempy>0 && matrix[x][tempy-1]==matrix[x][y]){
                                matrix[x][tempy-1] = 0;
                                matrix[x][y] *= 2;
                            }
                        }
                        break;
                    }
                }
            }
        }
    }
    public static void right(int[][] matrix){
        for(int y = SIZE-1; y > -1; y--){
            for(int x = SIZE-1; x > -1; x--){
                for(int tempx = x-1; tempx > -1; tempx--){
                    if(matrix[tempx][y]!=0){
                        if(matrix[x][y]==matrix[tempx][y]){
                            matrix[x][y] *= 2;
                            matrix[tempx][y] = 0;
                        }
                        else if(matrix[x][y] == 0){
                            matrix[x][y] = matrix[tempx][y];
                            matrix[tempx][y] = 0;
                            //handling of specific case: 16 16 16 16
                            if(tempx>0 && matrix[tempx-1][y]==matrix[x][y]){
                                matrix[tempx-1][y] = 0;
                                matrix[x][y] *= 2;
                            }
                        }
                        break;
                    }
                }
            }
        }
    }
    public static void up (int[][] matrix){
        for(int x = 0; x < SIZE; x++){
            for(int y = 0; y < SIZE; y++){
                for(int tempy = y+1; tempy < SIZE; tempy++){
                    if(matrix[x][tempy]!=0){
                        if(matrix[x][y]==matrix[x][tempy]){
                            matrix[x][y] *= 2;
                            matrix[x][tempy] = 0;
                        }
                        else if(matrix[x][y] == 0){
                            matrix[x][y] = matrix[x][tempy];
                            matrix[x][tempy] = 0;
                            //handling of specific case: 16 16 16 16
                            if(tempy<3 && matrix[x][tempy+1]==matrix[x][y]){
                                matrix[x][tempy+1] = 0;
                                matrix[x][y] *= 2;
                            }
                        }
                        break;
                    }
                }
            }
        }
    }

    
}