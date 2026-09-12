/*. Input n and take n integers into an array; print them. */
import java.util.*;
public class printing_n_elements{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }

    

}}