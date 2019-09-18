import java.io.*;
import java.util.Scanner;
class One{
   public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k = n;
        int sum=0;
        int pal=0;
        while(n!=0){
            int x=n%10;
            if(x%2==0){
                sum=sum+x;
            }
            pal=(pal*10)+x;
            n=n/10;
        }
       
       if(k==pal){
           System.out.print(k+ " is a palindrome ");
       }
       else{
           System.out.print(k +" is not a palindrome ");
       }
       if(sum>25){
           System.out.print("and sum of even numbers is greater than 25.");
       }
       else{
           System.out.print("and sum of even numbers is less than or equal to 25.");
       }
   }
}