/* 




copy the below code and execute in HackerRank

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
         StringBuilder sb = new StringBuilder(A);
        String B = sb.reverse().toString();
        if (A.equals(B)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}






*/