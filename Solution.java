import java.util.*;


class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a[]=new int[t];
        int b[]=new int[t];
        int n[]=new int[t];
        for (int i = 0; i < t; i++) {
            a[i]=in.nextInt();
            b[i]=in.nextInt();
            n[i]=in.nextInt();
        }
        System.out.print("\n");
        for(int i=0;i<t;i++){
            
            long sum=a[i]+b[i];
            System.out.print(sum);
                   if (n[i]>1) {
                       System.out.print(" ");
                        for(int j=1;j<n[i];j++){
            sum+=(Math.pow(2, j))*(b[i]);
                    if(j==n[i]-1){
                
                     System.out.print(sum);}
                     else{
                    System.out.print(sum+" ");}
            
            }
                   }System.out.println();
        }
        in.close();
    }
}