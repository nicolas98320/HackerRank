import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine().replace("\\s+","").toLowerCase();
        BitSet b = new BitSet();

        for(char c: str.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                b.set(c - 'a');
            }
        }
        if(b.cardinality() == 26)
            System.out.println("pangram");
        else
            System.out.println("not pangram");

    }
}