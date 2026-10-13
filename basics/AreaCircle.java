import java.util.Scanner;
public class AreaCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        double Radius = sc.nextDouble();
        double area = Math.PI * Radius * Radius ;
        System.out.println("Area of circle = " + area);
        sc.close();
    }
}