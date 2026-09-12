//Count how many times a given element appears. 
import java.util.*;
public class count_element_appearance{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         int x=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println("The element appears "+count+"times in the given array");
    }
}