import java.util.Scanner;
public class sumofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int first = sc.nextInt();
        System.out.println("enter the second number : ");
        int second = sc.nextInt();
        System.out.println("enter the third number : ");
        int third = sc.nextInt();
        int sum = first + second + third ;
        System.out.println("final sum = " + sum);
        sc.close();
    }
    
}
