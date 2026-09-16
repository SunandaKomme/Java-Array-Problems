//10. Copy one array to another manually.

import java.util.*;
public class copyingonearraytoanothermanually{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr1=new int[n];
        int[]arr2=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
}
}