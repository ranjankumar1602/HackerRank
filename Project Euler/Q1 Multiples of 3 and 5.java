import java.util.*;

public class Solution {
    private static long nth(long N, long a, long l) {
        
        long n = ((l - a) / a) + 1;
        long sum = (n * ((2 * a) + ((n - 1) * a)))/2;
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0) {
            long N = sc.nextLong();
            long n = N-1;
            long sum3 = nth(n, 3, n - (n % 3));
            long sum5 = nth(n, 5, n - (n % 5));
            long sum15 = nth(n, 15, n - (n % 15));
            long ans = (sum3 + sum5) - sum15;
            System.out.println(ans);
            t--;
        }
    }
}
