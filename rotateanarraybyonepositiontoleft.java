import java.util.*;
public class rotateanarraybyonepositiontoleft{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        int temp=arr[0];
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i==n-1){
                ans.add(temp);
            }else{
              arr[i]=arr[i+1];
              ans.add(arr[i]);
            }
        }
        System.out.println(ans);
        
    }}
