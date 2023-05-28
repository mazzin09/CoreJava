package MethodandClasses.CollectionFramework.Algorithm;

public class MergePractice {

    void merge(int arr[], int low, int middle , int high){
        int leftLength = middle - low + 1;
        int rightLength = high - middle;

        int left[] = new int[leftLength];
        int right[] = new int[rightLength];

        for(int i = 0; i < leftLength; i ++){
            left[i] = arr[low+i];
        }

        for (int j = 0; j < rightLength; j ++){
            right[j] = arr[middle + 1 + j];
        }

        int i,j,k;
        i = 0;
        j = 0;
        k = low;
        while (i < leftLength && j < rightLength){ //3,9    4,5
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < leftLength){
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < rightLength){
            arr[k] = right[j];
            j++;
            k++;
        }

    }

    void mergeSort(int arr[],int low, int high){
        if(low < high){
            // m divides the array into subarrays.
            int m = (low+high)/2;

            mergeSort(arr,low, m);

            mergeSort(arr,m+1,high);

            merge(arr, low, m, high);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,11,15,5,10,2,7,12,13};
        MergePractice mp = new MergePractice();
//        loop();
        mp.mergeSort(arr,0, arr.length - 1);
        printArray(arr);
    }
}
