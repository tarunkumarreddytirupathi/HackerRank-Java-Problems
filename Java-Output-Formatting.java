/* 




copy the below code and execute in HackerRank

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //  sc.nextLine();
                
                System.out.print(s1);
                for (int j = 0; j < (15-(s1.length())); j++) {
                    System.out.print(" ");
                }
               
                s1=Integer.toString(x);;
                   
              if (s1.length()<2) {
                    System.out.print("00"+x+" \n");
                }
            else if (s1.length()<3) {
                    System.out.print("0"+x+" \n");
                }
               
                else{
                    System.out.print(x+" \n");
                }
            }
            System.out.println("================================");

    }
}






*/