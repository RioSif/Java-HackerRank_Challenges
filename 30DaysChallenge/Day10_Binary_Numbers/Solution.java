package Day10_Binary_Numbers;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int sum = 0;
        int max = 0;

        while (n != 0) {

            if (n % 2 != 0) {
                sum++;
            } else {
                sum = 0;
            }

            if (sum > max) {
                max = sum;
            }

            n /= 2;
        }


        System.out.println(max);

        scanner.close();
    }
}
