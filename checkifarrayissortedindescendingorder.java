//. Check if the array is sorted in descending order. 
import java.util.*;
public class checkifarrayissortedindescendingorder{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean isSorted=true;
        for(int i=n-1;i>0;i--){
            if(arr[i]>arr[i-1]){
              isSorted=false;
              break;  
            }
          
        }
        if(isSorted){
            System.out.println("array is sorted in descending order");
        }else{
            System.out.println("array is not sorted in descending order");
        }
    }
}