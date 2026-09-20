// Check if the array is sorted in ascending order
import java.util.*;
public class checkifarrayissortedinascendingorder{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        boolean isSorted=true;
        for(int i=n-1;i>0;i--){
            if(arr[i]<arr[i-1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted in ascending order");
        }else{
            System.out.println("Array is not sorted in ascending order");
        }
    }}
