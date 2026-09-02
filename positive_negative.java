import java.util.Scanner;
public class positive_negative{
    public static void main(String[] args) {
        System.out.println("Enter any Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<0){
            System.out.println("Given number is negative ");
        }
        else if (n>0){
            System.out.println("Given number is positive ");
        }
        else{System.out.println("number is zero");}
        sc.close();
    }
}