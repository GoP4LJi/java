import java.util.Scanner;
public class even_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even_sum =0;
        int n = sc.nextInt();
        for (int i = 0 ;i<n;i++){
            int N = sc.nextInt();
            if (N%2==0){
                even_sum+=N;
            }
        }
        System.out.println(even_sum);
    }
}