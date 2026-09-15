//. Compare two arrays — check if they are equal (same elements & order).
import java.util.*;
public class checkiftwoarraysareequal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr1=new int[n];
        int[]arr2=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }

        boolean value=true;
        for(int i=0;i<n;i++){
            if(arr1[i]!=arr2[i]){
               value=false;
               break;
        }
        }
        if(value){
            System.out.println("Two arrays are equal");
        }else{
           System.out.println("Two arrays are not equal");
        }

    }
    }

