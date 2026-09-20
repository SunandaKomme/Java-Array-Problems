//5. Find the difference between the largest and smallest element.
import java.util.*;
public class differencebetweensmallestandlargest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<n;i++){
          if(arr[i]>max){
            max=arr[i];
          }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int diff=max-min;
        System.out.println("The difference between the largest and smallest element is "+diff);

    }}

