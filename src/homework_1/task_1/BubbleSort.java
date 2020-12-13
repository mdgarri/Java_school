package homework_1.task_1;

public class BubbleSort {

    //bubble sort function
    static int[] bubble_sort(int[] array) {

        boolean flag;

        int size = array.length;

        for (int i = 0; i < size - 1; i++){
            flag = false;

            for (int j = 0; j < size - i - 1; j++)
                if (array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = true;
                }

            if (!flag) return array;
        }

        return array;
    }


    //main for testing
    public static void main(String[] args) {

        int[] testArray = Other.generateArray(25);

        int[] sortedArray = bubble_sort(testArray);

        System.out.print("Sorted array: ");
        Other.printArray(sortedArray);

    }
}
