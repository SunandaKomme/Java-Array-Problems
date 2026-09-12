import java.util.*;
public class average_of_elements{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        int average=sum/n;
        System.out.println("Average of the given elements is "+average);

    }}
