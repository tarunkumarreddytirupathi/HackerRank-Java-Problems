/* 




copy the below code and execute in HackerRank

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            long sum=a+b;
            System.out.print(sum);
                   if (n>1) {
                       System.out.print(" ");
                        for(int j=1;j<n;j++){
            sum+=(Math.pow(2, j))*(b);
                    if(j==n-1){
                
                     System.out.print(sum);}
                     else{
                    System.out.print(sum+" ");}
            
            }
                   }System.out.println();
        }
        in.close();
    }
}


*/