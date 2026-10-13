import java.util.Scanner;

public class oshot {
    public static void main(String[] args) {
        //STRING
        /*System.out.println("Hello, World!");
        String name = new String("Hello");
        System.out.println(name);
        System.out.println(name.charAt(2));
        System.out.println(name.length());
        String name_2 = name.replace('e','b');
        System.out.println(name_2);*/

        //SUBSTRING 
        // String name = "AMAN AND AKKU";
        // System.out.println(name.substring(0,4));
         
        //ARRAYS
        // int age = 20;
        // int [] arr = new int[5];
        // arr[0] =  20;
        // arr[1] = 20;
        // arr[2] = 40;
        // arr[3] = 50;
        // System.out.println(arr[2]);

        // creating an array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
    }
}
