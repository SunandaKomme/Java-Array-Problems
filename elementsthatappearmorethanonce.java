//Print all elements that appear more than once. 

import java.util.*;
public class elementsthatappearmorethanonce{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        ArrayList<Integer> freq=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            boolean alreadyCounted=false;
            for(int k=0;k<i;k++){
                if(arr[i]==arr[k]){
                    alreadyCounted=true;
                    break;
                }
            }
            if(alreadyCounted){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>1){
                freq.add(arr[i]);
            }
        }
        System.out.println(freq);

    }
}