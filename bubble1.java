import java.util.Scanner;

public class bubble1 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println();
        bubblesort(arr);
        printsort(arr);
    }

    public static void bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
          int swaps=0;
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    swaps++;
                }
                
                
            }
            if(swaps==0){
                System.out.println("Sorted array ");
                break;   
              }
        }
    }
    public static void printsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
            
        }
        System.out.println();
    }
}

