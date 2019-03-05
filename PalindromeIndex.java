package palindromeIndex;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PalindromeIndex {

    // Complete the palindromeIndex function below.
    static int palindromeIndex(String s) {
        for(int i =0,j =s.length()-1; i<j; i++, j--)
            if(s.charAt(i)!=s.charAt(j))
                if(isPal(s, i))
                    return i;
                else if(isPal(s, j))
                    return j;
        return -1;
    }
    
    static boolean isPal(String s, int index){
        for(int i =index+1,j =s.length()-1-index; i<j; i++, j--)
            if(s.charAt(i)!=s.charAt(j))
                return false;
        return true;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = palindromeIndex(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
