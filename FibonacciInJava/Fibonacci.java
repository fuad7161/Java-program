package FibonacciInJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Fibonacci {
    private static int[] dp;
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        dp = new int[n+3];
        System.out.println(Nth_Fibonacci(n));
    }
    public static int Nth_Fibonacci(int x){
        if(x <= 1)return x;
        if(dp[x] != 0)return dp[x];
        return dp[x] = Nth_Fibonacci(x-1)+Nth_Fibonacci(x-2);
    }


    // Skip this part....
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens()) 
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    
        int [] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
