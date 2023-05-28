package MethodandClasses.CollectionFramework.Algorithm;


public class QuickSortDemo {

     int partition(int arr[],int low, int high){
        int pivot = arr[(low + high)/2];
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
        return low;
    }

    void quickSort(int arr[], int low, int high){
         int pi = partition(arr, low, high);
         if(low < pi-1){
             quickSort(arr,low,pi-1);
         }
         if(pi < high){
             quickSort(arr,pi,high);
         }
    }

    void printAll(int[] arr){
         for (int i :arr){
             System.out.println(i + " ");
             i++;
         }
    }


    public static void main(String[] args) {
        int arr[] = {15,9,7,13,12,16,4,8,11};
        QuickSortDemo qs = new QuickSortDemo();
        qs.quickSort(arr,0, arr.length - 1 );
        qs.printAll(arr);
    }
}
