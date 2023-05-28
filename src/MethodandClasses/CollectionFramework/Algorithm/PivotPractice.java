package MethodandClasses.CollectionFramework.Algorithm;

public class PivotPractice {

     static void partition(int arr[],int low, int high){
      int pivot = arr[(low + high)/2];
//        System.out.println(pivot);
         while (low <= high){
             while (arr[low] < pivot){
                 low++;
             }
             while (arr[high] > pivot){
                 high--;
             }

             if(low <= high){
                 int temp = arr[low];
                 arr[low] = arr[high];
                 arr[high] = temp;
                 low++;
                 high--;
             }
         }
             for (int i = 0; i < arr.length; i ++){
                 System.out.println(arr[i]);
             }
    }

    public static void main(String[] args) {
        int arr[] = {15,9,7,13,12,16,4,8,11};
        partition(arr,0,arr.length - 1);
    }
}
