import java.io.*;
import java. util. Scanner;
import java.util.ArrayList;

class SortNumber{
    public static void sort()
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        ArrayList<Integer> myArr = new ArrayList<Integer>(); 
        int sum=0;
        while(n!=0){
            int x =n%10;
            myArr.add(x);
            n =n/10;
            if(x%2==0) {
                sum = sum + x;
            }
        }
        for(int j=0;j<myArr.size()-1;j++) {
            for(int i=0; i<myArr.size()-1;i++){
                if(myArr.get(i)<myArr.get(i+1)){
                    int t=myArr.get(i);
                    myArr.set(i, myArr.get(i+1));
                    myArr.set(i+1,t);
                } 
            }  
        }
        for(int i: myArr){
        System.out.print(i); 
        } 
        System.out.println();
        System.out.println(sum);
        if(sum>15){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }        
}