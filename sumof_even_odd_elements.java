//sum of the even and odd elements
public class sumof_even_odd_elements{
    public static void main(String[] args) {
        int oddsum=0;
        int evensum=0;
        int[]arr={10,20,33,40,53};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                 evensum=evensum+arr[i];
            }else{
                oddsum=oddsum+arr[i];

            }
        }
        System.out.println("Sum of even elements "+evensum);
        System.out.println("Sum of odd elements is "+oddsum);
    
         
    }}
