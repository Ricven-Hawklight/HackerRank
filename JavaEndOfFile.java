import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        while ( in.hasNextLine()) {
            System.out.println(i + " " + in.nextLine());
            i++;
        }
    }
}