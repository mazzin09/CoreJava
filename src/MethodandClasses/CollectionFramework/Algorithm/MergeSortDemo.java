package MethodandClasses.CollectionFramework.Algorithm;

public class MergeSortDemo {

    void merge(int arr[], int p, int q, int r){
        // Create 2 array L and M

        int n1 = q-p+1;
        int n2 = r-q;

        int L[] = new int[n1];
        int M[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[p + i];
        for (int j = 0; j < n2; j++)
            M[j] = arr[q + 1 + j];

        int i,j,k;
        i = 0;
        j = 0;
        k = p;

        while(i < n1 && j < n2){
            if(L[i] <= M[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = M[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = M[j];
            j++;
            k++;
        }
    }

    void mergeSort(int arr[], int l, int h){
        if(l < h){
        // m divides the array into subarrays.
            int m = (l+h)/2;

            mergeSort(arr,l, m);

            mergeSort(arr,m+1,h);

            merge(arr, l, m, h);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3,9,4,5,8,2,6};
        MergeSortDemo ms = new MergeSortDemo();
        ms.mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}
