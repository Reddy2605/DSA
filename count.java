public class count {
    public static void main(String args[]){
        int arr[] = {3,5,6,8,7,1,3,1,4,5};
        countsort(arr);
        print(arr);
    }
    public static void countsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        //count
        int count[] = new int[largest+1];
        for(int i =0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting 
        int j =0;
        for(int i =0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void print(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
