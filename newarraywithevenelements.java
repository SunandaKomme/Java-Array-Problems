// Create a new array containing only even elements. 
import java.util.*;
public class newarraywithevenelements{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> evenelements=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenelements.add(arr[i]);
            }
        }
      System.out.println(evenelements);

    }
}