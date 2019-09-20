import java.io.*;
import java. util. Scanner;
import java.util.Random; 

class Menu{
    public static void main (String[] args){
        while(true){
           System.out.println("Please Enter a number of your choice");
           System.out.println("1. Check Palindrome");
           System.out.println("2. Choose for Tom and Jerry");
           System.out.println("3. Check for Vowel and Consonant");
           System.out.println("4. Iteration loop with Numbers");
           System.out.println("5. Addition of Intergers in String");
           System.out.println("6. Character Check");
           System.out.println("7. Sorting Of Number ");
           System.out.println("8. Guessestimate");
           System.out.println("9. Reverse a String of your Choice");
           System.out.println("10. Repeating a part of String");
           System.out.println("Enter 0 to exit");
           Scanner scanner = new Scanner(System.in);
           int choice_no =scanner.nextInt();
           int flag=0;
           switch (choice_no){
               case 0:
                   flag=1;
                   break;
               case 1:
                   Palindrome.palindrome();
                   break;
               case 2:
                   TomAndJerry.tom_jerry();
                   break;
               case 3:
                   VowelAndConsonant.vowel_consonant();
                   break;
               case 4:
                   Iteration.iteration();
                   break;
               case 5:
                   AddStringInt.addintegers();
                   break;
               case 6:
                   CharIdentity.char_identity();
                   break;
               case 7:
                   SortNumber.sort();
                   break;
               case 8:
                   GuessNo.guess_no();
                   break;
               case 9:
                   ReverseString.reverse();
                   break;
               case 10:
                   RepeatCharacters.repeat_char();
                   break;
               default :
                    System.out.println("Enter a valid choice");      
            }
            if( flag==1) {
                break;
            }
        }
        
       
   }
}     