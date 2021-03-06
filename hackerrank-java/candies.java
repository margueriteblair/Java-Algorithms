import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the candies function below.
    static long candies(int n, int[] arr) {
    long candies = 0;
    ArrayList<Integer> left = new ArrayList<>(Collections.nCopies(n,1));
    ArrayList<Integer> right = new ArrayList<>(Collections.nCopies(n,1));

    for (int i = 1; i < n; i++) {
      if(arr[i] > arr[i - 1]) right.set(i, right.get(i) + right.get(i - 1));
    }

    for (int i = n - 2; i >= 0; i--) {
      if(arr[i] > arr[i + 1]) left.set(i, left.get(i) + left.get(i + 1));
    }

    for(int i = 0; i < n; i++) {
      candies += Math.max(left.get(i), right.get(i));
    }

    return candies;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        long result = candies(n, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the candies function below.
    static long candies(int n, int[] arr) {
        int total = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        right[0] = 1;
        left[0] = 1;
        left[n-1] = 1;
        right[n-1] = 1;
        
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i-1]) {
                left[i] = left[i-1] + 1;
            } else {
                left[i] = 1;
            }
        }
        
        for (int i = n-2; i >= 0; i--) {
            if (arr[i] > arr[i+1]) {
                right[i] = right[i+1] + 1;
            } else {
                right[i] = 1;
            }
        }
        
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        
        for (int i = 0; i < arr.length; i++) {
            total += Math.max(left[i], right[i]);
        }
        return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        long result = candies(n, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

