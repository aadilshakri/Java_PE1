import java.io.*;
import java.util.Scanner;
class Palindrome{
   public static void palindrome(){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k = n;
        int sum=0;
        int rev_no=0;
        while(n!=0){
            int x=n%10;
            if(x%2==0){
                sum=sum+x;
            }
            rev_no=(rev_no*10)+x;
            n=n/10;
        }
       
       if(k==rev_no){
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