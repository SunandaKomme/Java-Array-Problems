//craete a new array and print squares of elements of array
import java.util.*;
public class squareofarrayelements{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int[]arr=new int[n];
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         ArrayList<Integer> squares=new ArrayList<>();
         for(int i=0;i<n;i++){
            squares.add(arr[i]*arr[i]);
         }
         System.out.println(squares);
    }}
