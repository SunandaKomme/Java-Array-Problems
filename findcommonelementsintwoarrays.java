//4. Find the common elements between two arrays. 
public class findcommonelementsintwoarrays{
    public static void main(String[] args) {
        int[]arr1={20,30,56,78,89};
        int[]arr2={10,56,78,89,98};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                }
            }
        }
}}
