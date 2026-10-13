import java.util.Scanner;
public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println(ch);
        int ascii = (int)ch;
        System.out.print("ascii value of above character "+ ascii);
    sc.close();
    }
}
