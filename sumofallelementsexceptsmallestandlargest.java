// Find the sum of all elements except the largest and smallest. 
import java.util.*;
public class sumofallelementsexceptsmallestandlargest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<n;i++){
            if(i==0||i==n-1){
                continue;
            }else{
              sum=sum+arr[i];
            }
        }
        System.out.println(sum);
    }}
