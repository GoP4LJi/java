// package DAY_1;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int [] marks = new int[n];
//         for (int i=0;i<n;i++){
//             marks[i] = sc.nextInt();
//         }
//         int target = sc.nextInt();
//         int count = 0;
//         for (int i=0;i<n;i++){
//             if (marks[i]> target){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
    
// }


// sum of all elements in an array
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr =new int [n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i= 0;i<n;i++){
            sum += arr[i];
        }
        System.out.println(sum);



// Find Maximum Score 
    //    Scanner sc = new Scanner(System.in);
    //     int n =  sc.nextInt();
    //     int [] score = new int[n];
    //     for (int i = 0;i<n;i++){
    //         score[i] = sc.nextInt();
    //     } 
    //     int max  = score[0];
    //     for (int i = 1;i<n;i++){
    //         if (score[i]>max){
    //             max = score[i];
    //         }
    //     }
    //     System.out.println(max);

// count the number of minimum elements in an array
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int [] arr = new int[n];
        // for (int i = 0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // int min = arr[0];
        // for (int i=0;i<n;i++){
        //     if (arr[i]<min){
        //         min = arr[i];          
        //     }
        // }
        // int count = 0;
        // for (int i=0;i<n;i++){
        //     if (arr[i]== min){
        //         count++;
        //     }
        // }
        // System.out.println(count);

        //find the even count and odd count in an array
        // Scanner sc = new Scanner (System.in);
        // int n = sc.nextInt();
        // int [] arr = new int[n];
        // for(int i = 0;i<n;i++){
        //     arr[i] =  sc.nextInt();
        // }
        // int even_count = 0;
        // int odd_count = 0;
        // for (int i=0;i<n;i++){
        //     if(arr[i]%2==0){
        //         even_count++;
        //     }
        //     else{
        //         odd_count++;
        //     }
        // }
        // System.out.println("evencount= "+ even_count + "\noddcount"+odd_count);
    }
}