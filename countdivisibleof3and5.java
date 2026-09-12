//count how many elements are divisible by both 3 and 5
import java.util.*;
public class countdivisibleof3and5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%3==0&&arr[i]%5==0){
               count++;
            }
        }
        System.out.println("Number of elements that are divided by both 3 and 5 are "+count);
    }}
