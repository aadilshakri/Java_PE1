import java.io.*;
import java. util. Scanner;

class Ten{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        String r = repeat(s,n);
        System.out.println(s + r);

        
    }
    public static String repeat(String s,int n){
        String str="";
        for(int i=0;i<n;i++){
            str+= s.substring(s.length()-n); 
        }
        return str; 
    }
}