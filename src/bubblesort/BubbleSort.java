package bubblesort;

/**
 * Created by therioyo on 16.09.14.
 */
public class BubbleSort {
    static int[]arr = {6,2,4,5,1};;
    public static void main(String[] args) {
//        bubbleSort();
//        selectionSort();
        insertionSort();

        for(int i=0;i<arr.length;++i){
            System.out.print(arr[i]+" ");
        }
    }
    static void bubbleSort(){
        for(int i=0;i< arr.length;++i){
            for(int j=1;j<arr.length-i;++j){
                if(arr[j]<arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
    }
    static void selectionSort(){
        for(int i=0;i<arr.length-1;++i){
            int min=arr[i];
            int minInd = i;
            for(int j=i+1;j<arr.length;++j){
                if(arr[j]<min){
                    min=arr[j];
                    minInd = j;
                }
            }
            arr[minInd]=arr[i];
            arr[i]=min;
        }
    }
    static void insertionSort(){
        for(int i=1;i<arr.length;++i){
            for(int j=0;j<i;++j){
                if(arr[i]<arr[j]){
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }
}
