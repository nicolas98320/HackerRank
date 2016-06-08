import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        for(int i = length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        sc.close();
        
    }
}