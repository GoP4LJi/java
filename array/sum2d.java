import java.util.Scanner;
public class sum2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] arr = new int[r][c];
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        
        // sum of 2d array
        // int sum = 0;
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         sum += arr[i][j];
        //     }
        // }
        // System.out.print(sum);


        // row sum and column sum
        // for(int i= 0;i<r;i++){
        //     int sum = 0;
        //     for (int j=0;j<c;j++){
        //         sum+= arr[i][j];
        //     }
        //     System.out.println(sum);
        // }
 
        //column sum 
        for (int j = 0;j<c;j++){
            int sum = 0;
            for ( i = 0;i<r;i++){
                    sum += arr[i][j];
            }
            System.out.println(sum);
        }
    }
}
}