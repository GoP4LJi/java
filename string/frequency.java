import java.util.Scanner;
public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int [256];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch]++;
        }
        for (int i=0;i<256;i++){
            if (freq[i]>0){
                
            }
        }
    }
}
