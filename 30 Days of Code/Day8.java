import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        
        Map<String, Integer> phoneNumber = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneNumber.put(name, phone);
        }
        
        while(in.hasNext()){
            String s = in.next();              
            if (phoneNumber.containsKey(s)) {
                int value = phoneNumber.get(s);
                System.out.println(s + "=" + value);
            } else {
                System.out.println("Not found");
            }   
        }
        in.close();
    }
}