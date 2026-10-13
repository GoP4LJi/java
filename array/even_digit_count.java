
import java.util.Scanner;
public class even_digit_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e_count = 0 ;
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i= 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int d_count = 0;
            int num = arr[i];
            while(num>0){
                num = num/10;
                d_count++;
            }
            if(d_count%2==0){
                e_count+=1;
            }
        }
        System.out.println(e_count);
    }
}