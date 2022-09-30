import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0) {
            long N = sc.nextLong();
            long a = 2;
            long b = 8;
            long c = 34;
            long sum = 10;
            while(c < N) {
                sum += c;
                a = b;
                b = c;
                c = (4 * b) + a;
            }
            
            System.out.println(sum);
            t--;
        }
    }
}
