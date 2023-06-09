import java.util.Scanner;
public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String mysubstr = "";
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
        for (int i = 0; i < s.length() - k + 1; i++) {
            mysubstr = s.substring(i,k + i);
            if (smallest.compareTo(mysubstr) > 0) {
                smallest = mysubstr;
            }
            if (largest.compareTo(mysubstr) < 0) {
                largest = mysubstr;
            }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
