package MethodandClasses.CollectionFramework.Algorithm;

public class NewMergeSortDemo {
    int arr[];
    int tempArr[];
    int length;
    public void sort(int array[]){
        this.arr = array;
        this.length = array.length;
        this.tempArr = new int[length];
        divideArray(0,length - 1);
    }

    public void divideArray(int lowerIndex, int higherIndex){
        if(lowerIndex < higherIndex){
            int middle = (higherIndex + lowerIndex)/2;
            //sort the left side of an array
            divideArray(lowerIndex, middle);

            //sort the right side of an array
            divideArray(middle+1, higherIndex);

            mergeArray(lowerIndex, higherIndex, middle);

        }
    }

    public void mergeArray(int lowerIndex, int higherIndex, int middle){
        for (int i = lowerIndex; i < higherIndex; i ++){
            tempArr[i] = arr[i];
        }

        int i = lowerIndex;
        int j = middle+1;
        int k = lowerIndex;

        while(i < middle && j < higherIndex){
            if (tempArr[i] <= tempArr[j]){
                arr[k] = tempArr[i];
                i++;
            }
            else{
                arr[k] = tempArr[j];
                j++;
            }
            k++;
        }
        while (i < middle){
            arr[k] = tempArr[i];
            i++;
            k++;
        }
        while (j < higherIndex){
            arr[k] = tempArr[j];
            j++;
            k++;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i){
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        int array[] = {1,4,2,5,8,7};
        NewMergeSortDemo ms = new NewMergeSortDemo();
        ms.sort(array);
        printArray(array);
    }
}
