import java.io.*;
import java. util. Scanner;

class RepeatCharacters{
    public static void repeat_char()
    {
        
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        String r = sub_string(s,n);
        System.out.println(s + r);
        
    }
    public static String sub_string(String s,int n){
        String str="";
        for(int i=0;i<n;i++){
            str+= s.substring(s.length()-n); 
        }
        return str; 
    }
}