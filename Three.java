import java.io.*;
import java. util. Scanner;

class Three{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String vowel= "aeiouAEIOU";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'A'>=0 && s.charAt(i)-'A'<=25 ||s.charAt(i)-'a'>=0 && s.charAt(i)-'a'<=25){
                int count=0;
                for(int j=0;j<vowel.length();j++){
                    if(s.charAt(i)== vowel.charAt(j)){
                        count=count+1;
                        System.out.print("Vowel");
                        break;
                    }
                }
                if(count==0){
                    System.out.print("Consonant");
                }
            }
            else{
            System.out.println("Error");
            }
        }
    }
}
       