// Input an element x — check if it exists in the array
import java.util.*;
public class checkif_x_exists{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
           if(arr[i]==x){
            System.out.println("Element exists in the array");
           }
           }
        }
        
    }
