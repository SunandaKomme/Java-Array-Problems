// Print all unique elements (those that occur exactly once). 
import java.util.*;
public class printuniqueelementsthatoccuronce{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            boolean alreadyCounted=false;
            for(int k=0;k<i;k++){
                if(arr[i]==arr[k]){
                    alreadyCounted=true;
                }
            }
            if(alreadyCounted){
               continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
              if(arr[i]==arr[j]){
                count++;
              }
            }
            if(count<=1){
                System.out.print(arr[i]+" ");
            }

        }
    }
}