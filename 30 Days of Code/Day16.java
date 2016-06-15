import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        try{
            int i = Integer.parseInt(s);
            System.out.println(i);
            
        } catch(NumberFormatException e) {
            
            System.out.println("Bad String");
        }
    }
}