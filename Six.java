import java.io.*;
import java. util. Scanner;

class Six{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        char n = sc.next().charAt(0);
        if(Character.isLetter(n)==true){
            if(Character.isUpperCase(n)==true){
                System.out.println("Capital");
            }
            else{
                System.out.println("Small");
            }
        }
        if(Character.isDigit(n)==true){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special");
        }
        
    }
}