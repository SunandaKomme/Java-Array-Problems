//Swap alternate elements (1st ↔ 2nd, 3rd ↔ 4th, etc.)
import java.util.*;
public class swapalternateelements{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}