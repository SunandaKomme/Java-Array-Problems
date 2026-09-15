//Swap the first and last elements of the array. 
import java.util.*;
public class swappingfirstandlastelements{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp=arr[0];
        for(int i=0;i<n;i++){
            if(i==0){
                arr[i]=arr[n-1];
            }else if(i==n-1){
                arr[i]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }}
