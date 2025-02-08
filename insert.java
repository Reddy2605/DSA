import java.util.*;
public class insert {
    public  static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no. of elemnst in an array ");
        int n = sc.nextInt();
        int arr []= new int [n];
        System.out.println("Enter the elemnts of array ");
        for(int i =0;i< n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println();
        insertionsort(arr);
        printsort(arr);
    
    
    }
    public static void insertionsort(int arr[]){
        for(int i =1;i<arr.length;i++){
            int curr = arr[i];
            int prev= i-1;
            //finding the correct position to insert
             while(prev>=0&& arr[prev]> curr){
                arr[prev+1]=arr[prev];
                prev--;
             }
             arr[prev+1]= curr;
        }
    }

    public static void printsort(int []arr){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    
}
