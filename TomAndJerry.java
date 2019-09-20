import java.io.*;
import java. util. Scanner;

class TomAndJerry{
    public static void tom_jerry()
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if (n>20 && n<30)
        {
            if(n%2!=0){
            System.out.println("Tom");
            }
            else{
            System.out.println("Jerry");
            }
        }
        else{
             System.out.println("Check your Number");
        }
    }
    
}
