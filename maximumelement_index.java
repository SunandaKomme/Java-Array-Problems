//index of maximum element
import java.util.*;
public class maximumelement_index{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int largestelementindex=0;
    int[]arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int max=arr[0];
    for(int i=0;i<n;i++){
         if(arr[i]>=max){
            max=arr[i];
            largestelementindex=i;
         }
    }
    System.out.println("Largest element in the index is "+ largestelementindex);

    }
}