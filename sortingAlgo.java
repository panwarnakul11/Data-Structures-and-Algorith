import java.util.*;

public class sortingAlgo{
    
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        printarray(arr);
    }

    public static void  SelectionSort(int arr[]){
        
        for (int i = 0; i<arr.length; i++) {
            int min = i;
            for (int j = i+1; j <arr.length; j++) {
                if(arr[min]<arr[j]){
                    min=j;
                }
            }
            int temp= arr[i];
            arr[i]= arr[min];
            arr[min]=temp;

            
        }
        printarray(arr);


    }
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while (prev>=0 && arr[prev]< curr) {
                arr[prev+1] = arr[prev];
                prev--;   
            }
            arr[prev+1]= curr;
            
        }
        printarray(arr);
    }
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = count.length-1; i >=0; i--) {
            while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;

                
            }
            
        }
        printarray(arr);
    }

    public static void main(String[] args) {

        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        bubbleSort(arr);
        System.out.println();
        SelectionSort(arr);
        System.out.println();
        insertionSort(arr);
        System.out.println();
        countingSort(arr);

    }
}
