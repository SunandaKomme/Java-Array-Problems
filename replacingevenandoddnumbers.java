// Replace all even numbers with 1 and all odd with 0. 
import java.util.*;
public class replacingevenandoddnumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> manipulatedarray=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                arr[i]=1;
                manipulatedarray.add(arr[i]);
            }else{
                arr[i]=0;
                manipulatedarray.add(arr[i]);
            }
        }
        System.out.println(manipulatedarray);

        
    }}
