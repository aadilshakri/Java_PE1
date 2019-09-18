import java.io.*;
import java. util. Scanner;

class Nine{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String rev = "";
        int len = s.length();
        for (int i=len-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.print(rev);
        
        
    }
}