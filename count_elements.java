//count how many elements are positive ,negative or zero 
import java.util.*;
public class count_elements{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int count_positive=0;
        int count_negative=0;
        int count_zeros=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                count_negative++;
            }
            if(arr[i]>0){
                count_positive++;
            }
            if(arr[i]==0){
                count_zeros++;            
        }
    }
    System.out.println("number of positive elements "+count_positive);
    System.out.println("number of negative elements "+count_negative);
    System.out.println("number of zero elements "+count_zeros);

    }
    
}
