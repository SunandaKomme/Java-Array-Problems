//. Create a new array containing squares of all numbers using builtin method
import java.util.*;
public class creatingnewarraycontainssquareofnumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[]squares=new int[n];
        for(int i=0;i<n;i++){
            squares[i]=arr[i]*arr[i];
        }
        System.out.println(Arrays.toString(squares));
      
        
    }}

