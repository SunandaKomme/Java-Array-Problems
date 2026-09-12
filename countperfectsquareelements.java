//count how many elements in array are perfect squares
public class countperfectsquareelements{
    public static void main(String[] args) {
        int count=0;
        int[]arr={64,56,78,81,4};
        for(int i=0;i<arr.length;i++){
            int root=(int)Math.sqrt(arr[i]);
            if(root*root==arr[i]){
                count++;
            }
        }
        System.out.println("Number of perfect square elements are "+count);
        
    }}
