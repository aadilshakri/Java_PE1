import java.io.*;
import java. util. Scanner;

class AddStringInt{
    public static void addintegers()
    {
        int sum=0;
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String[] arrOfStr = s.split(" ");
        for(int i=0; i<arrOfStr.length; i++){
            sum =sum + Integer.parseInt(arrOfStr[i]);
        }
        System.out.println(sum);
    }
}


        