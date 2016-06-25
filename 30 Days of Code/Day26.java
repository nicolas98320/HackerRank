import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int da = scan.nextInt();
        int ma = scan.nextInt();
        int ya = scan.nextInt();

        int de = scan.nextInt();
        int me = scan.nextInt();
        int ye = scan.nextInt();

        int fine = 0;
        
        if ( ya > ye )
            fine = 10000;
        
        else if ( ya == ye ) {
            
            if ( ma > me )
                fine = (ma - me) * 500;
            
            else if ( ma == me ) {
                
                if ( da > de )
                    fine = (da - de) * 15;
            }
        }
        
        System.out.println(fine);
    }
}