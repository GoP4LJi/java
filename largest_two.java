import java.util.Scanner;
public class largest_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b = sc.nextInt();
        if (a<b){
            System.out.println(b + " is greatest");
        }
        else if(a>b){
            System.out.println(a+ " is greatest");
        }
        else{
            System.out.println("Both are equal");
        }
        sc.close();
    }
}
