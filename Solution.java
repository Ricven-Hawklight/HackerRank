import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaLoops {
    public void math(int a, int b, int n) {
        int ans = a;
        for ( int i = 0 ; i < n; i++) {
            ans += Math.pow(2, i) * b;
            System.out.print( ans + " ");
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        JavaLoops jl = new JavaLoops();
        
        int tc = in.nextInt();
        for (int i = 0; i < tc; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            jl.math(a, b, n);
            System.out.println();
        }
        
    }
}