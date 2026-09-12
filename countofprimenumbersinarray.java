//Count of prime numbers in array
public class countofprimenumbersinarray{
    public static void main(String[] args) {
        
        int primecount=0;
        int[]arr={2,3,8,9,5};
        
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=1;j<=arr[i];j++){
                if(arr[i]%j==0){
                   count++;
                }
            }
            if(count==2){
                primecount++;
            }
        }
        System.out.println("Number of primenumbers in the given array is "+primecount);
        
    }}
