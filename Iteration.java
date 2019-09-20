import java.io.*;
import java. util. Scanner;

class Iteration{
    public static void iteration()
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int j=1; j<=n; j++){
            for (int i=1; i<=j; i++){
                System.out.print(j + "");
            }
        }

    }
    
}
