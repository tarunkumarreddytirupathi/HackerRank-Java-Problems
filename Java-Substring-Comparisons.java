/* 


copy the below code and execute in HackerRank

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
       
        //take input
        String s=sc.next();
        int k=sc.nextInt();
        //create a string array to store all substrings
        String array[]=new String[s.length()-k+1];
        for(int i=0;i<s.length()-k+1;i++){
            array[i]=s.substring(0+i, k+i);
        }
        //sort the substrings using sort methonds in Arrays class 
       Arrays.sort(array);
       //print the output
       System.out.println(array[0]+"\n"+array[array.length-1]);
       //close the input sourceto avoid memory leaks and to allow the program to reclaim the scanner memory
       sc.close();
    }
}


*/