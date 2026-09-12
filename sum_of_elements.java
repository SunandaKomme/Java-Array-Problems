/*sum of elements in array*/
import java.util.*;
public class sum_of_elements{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
           sum=sum+arr[i];
        }
        System.out.println("Sum of elements of array is "+sum);
    }


}