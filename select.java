import java.util.*;
public class select {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the lements of the array ");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println();
        selectionsort(arr);
        printsort(arr);
    }

    public static void selectionsort(int arr[]){
        for(int i=0;i< arr.length-1;i++){
            int minpos=i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            //swap
            int temp = arr[minpos];
            arr[minpos]=arr[i];
            arr[i]= temp;
        }
    }

    public static void printsort(int []arr){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
