import java.io.*;
import java.util.Random; 
import java. util. Scanner;

class GuessNo{
    public static void guess_no()
    {
        Random rand = new Random(); 
        int tar_no= rand.nextInt(100);
        System.out.println(tar_no);
        Scanner sc = new Scanner (System.in);
        int n=0;
        while(tar_no!=n){
            n = sc.nextInt();
            if(n > tar_no){
                System.out.println("Number guessed is more than original number");
            }
            if(n < tar_no){
                System.out.println("Number guessed is less than original number");
            }
        }
        System.out.println("Number guessed matches the original number");
    }
}