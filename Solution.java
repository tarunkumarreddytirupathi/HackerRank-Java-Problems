// import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int count=0;
        while (s.hasNext()) {
            String line = s.nextLine();
            ++count;
            System.out.println(count+" "+line);
        }
        s.close();
    }
}