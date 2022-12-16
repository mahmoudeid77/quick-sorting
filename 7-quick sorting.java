import java.util.Scanner;
////////////////////////// program to quick sorting arrray
class quick_sorting {
    ////////////////////////// function to swap two values
  static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }  ////////////////////////// function to return the position of the pivot
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    ////////////////////////// function to achieve quick sotring
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    ////////////////////////// function to print array after sorting it
    static void printArray(int[] arr, int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    public static void main(String[] args)
    { int s;
        ////////////////////////// take array from user
        System.out.println("enter size of array : ");
        Scanner input =new Scanner(System.in);
         s= input.nextInt();
int arr[] = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = input.nextInt();
        }
        ////////////////////////// sort the array
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}